package packageBankSystem;
import com.dao.*;
import java.io.*;
import java.util.*;
//import java.time.format.DateTimeFormatter;
//import java.time.LocalDateTime; 
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
public class ProjectMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int customerId;
		String customerName;
		int age;
		int mobileNumber;
		String aadharNumber;
		String dob;
		boolean dateValidation;
		//---------------------
		long   accountNumber;
//		String ifscCode;
//		String bankName; 
		double balance=5000;
		String openingDate;
		//-------------------
		
		ArrayList<Customer> customers=new ArrayList<Customer>();
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\n");		
		System.out.println("-----*****---- Welcome to Banking System ----*****-----");
		System.out.println("\n\n");
		
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do{
			System.out.println("===============================================================================");
			System.out.println("\n");
			System.out.println("1-> Create New Customer Data");
			System.out.println("2-> Assign a Bank Account to a Customer");
			System.out.println("3-> Display balance or interest earned of a Customer");
			System.out.println("4-> Sort Customer Data");
			System.out.println("5-> Persist Customer Data");
			System.out.println("6-> Show All Customers");
			System.out.println("7-> Search Customers by Name");
			System.out.println("8-> Exit");
			System.out.println("\n");
			System.out.println("===============================================================================");
			
			System.out.println("Enter choice for opreation to be performed");
			try{
				choice=Integer.parseInt(b.readLine());				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			switch (choice) {
			  case 1:
				  	System.out.println("----- New Registration -----");
				  	System.out.print("Enter Customer's Name :");
					customerName=sc.next();
				  	System.out.print("Enter Customer's Age: ");
					age=sc.nextInt();
				  	System.out.print("Enter Customer's Mobile Number: ");
					mobileNumber=sc.nextInt();
				  	System.out.print("Enter Customer's Aadhar Number: ");
					aadharNumber=sc.next();
				  	System.out.print("Enter Customer's Date Of Birth: ");
					do{
					dob=sc.next();
					dateValidation=javaDateValidator.isValidDate(dob);
					if(dateValidation==false){
					  	System.out.println("Wrong Date Of Birth, Enter DOB Again");
					}
					}while(dateValidation!=true);
					Customer c=new Customer(customerName,age,mobileNumber,aadharNumber,dob);
					customers.add(c);
					
			    break;
			  
			  case 2:
//				    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//				    LocalDateTime now = LocalDateTime.now();
//				    openingDate=(String)(dtf.format(now));
				  	System.out.println("Enter Customer Id to whom bank account to be assigned");
				  	int t=0;
				  	temp :
				  	do{
				  	customerId=sc.nextInt();
				  	t=0;
				  	for(Customer cu:customers){
					  	if(customerId==cu.getCustomerId()){
					  		break temp;
					  	}
					  	t++;	
				  	}
				  	if(customers.size()==t){
					  	System.out.println("Wrong Customer Id Entered, Please Enter Again");				  		
				  	}
				  	}while(customers.size()==t);
				  	
				  	int acType;
				  	System.out.println("Enter option 1.Savings Account or 2.Fixed Deposite");
				  	acType=sc.nextInt();

				  	switch(acType){
				  	case 1:
				  		boolean isSalaryAccount;
					  	System.out.println("Is it Salary Account y/n?");
					  	char ch=(char)sc.next().charAt(0);
					  	
					  	if(ch=='y' || ch=='Y'){
					  		isSalaryAccount=true;
					  	}else{
					  		isSalaryAccount=false;
					  	}
					  	
					  	System.out.println("Enter Account Balance:");
					  	balance=sc.nextDouble();
					  	System.out.println("Enter Account Account Opening Date:");
					  	openingDate=sc.next();					  	
				  		if(isSalaryAccount==false ){
				  			//boolean ext=false;
				  			//do{
//							  	System.out.println("Enter Account Balance:");
//							  	balance=sc.nextDouble();
				  				try{
						  			InsufficientBalanceExceptionHandler.checkMinBalanceRequirement(balance);
						  			//ext=false;
								}
								catch(InsufficientBalanceException e){
									System.out.println(e.getException());
									break;
									//ext=true;
								}
				  			//}while(ext);
				  			
				  			//aa:
							  	for(Customer cu:customers){
								  	if(customerId==cu.getCustomerId()){
										accountNumber=(long)(Math.random()*(999999999-900000000+1)+900000000);
								  		//double acno;
								  		/*for(Customer cu2:customers){
								  			if(cu2==null){
								  				break;
								  			}else{
								  				acno=cu2.ac.accountNumber;}

									  		if(acno==accountNumber){
									  			System.out.println("Duplicate account Number Error");
									  			break aa;
									  		}
									  		else if(acno!=0L){
									  			System.out.println("Account Already Exist");
									  			break aa;
									  		}
									  	}*/
									  	Account a = new SavingsAccount("saving",isSalaryAccount,accountNumber,"SBI4136","SBI",balance, openingDate);
										//new Customer(cu,a);	
									  	cu.setAc(a);
									  	System.out.println("Account Successfully created for customer");
								  	}
							  		
							  	}
				  		}else{
				  			//aa:
							  	for(Customer cu:customers){
								  	if(customerId==cu.getCustomerId()){
										accountNumber=(long)(Math.random()*(999999999-900000000+1)+900000000);
									  	/*for(Customer cu2:customers){
									  		
								  		if(cu2.ac.accountNumber==accountNumber){
								  			System.out.println("Duplicate account Number Error");
								  			break aa;
								  		}
								  		else if(cu.ac.accountNumber!=0000000000){
								  			System.out.println("Account Already Exist");
								  			break aa;
								  		}}*/
									  	Account a = new SavingsAccount("saving",isSalaryAccount,accountNumber,"SBI4136","SBI",balance, openingDate);
										//new Customer(cu,a);	
									  	cu.setAc(a);
									  	System.out.println("Account Successfully created for customer");									  	
								  	}
							  		
							  	}
				  		}

					  					  		
				  		break;
				  	case 2:
//					    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//					    LocalDateTime now = LocalDateTime.now();
//					    openingDate=(String)(dtf.format(now));
					    double depositeAmount;
					    int tenure;					  	
					  	
					  	boolean ext;
					  	do{
						  	System.out.println("Enter Deposite Amount:");
						  	depositeAmount=sc.nextDouble();					  	
						if(depositeAmount<1000){
							System.out.println("Minimum Deposite Amount should be: 1000");
							ext=true;
						}else{
							ext=false;
						}
					  	}while(ext);					  	

					  	System.out.println("Enter Account Account Opening Date:");
					  	openingDate=sc.next();	
						//ext=true;

					  	do{
					  	System.out.println("Enter Deposite Tenure:");
					  	tenure=sc.nextInt();					  	
						if(tenure<1 || tenure>7){
							System.out.println("Minimum should be tenure is 1 year, Miximum should be tenure is 7 year");			
							ext=true;
						}else{
							ext=false;
						}
					  	}while(ext);
					  	//aa:
					  	for(Customer cu:customers){
						  	if(customerId==cu.getCustomerId()){
								accountNumber=(long)(Math.random()*(999999999-900000000+1)+900000000);
								
							  	/*for(Customer cu2:customers){
							  		
						  		if(cu2.ac.accountNumber==accountNumber){
						  			System.out.println("Duplicate account Number Error");
						  			break aa;
						  		}
						  		else if(cu.ac.accountNumber!=0000000000){
						  			System.out.println("Account Already Exist");
						  			break aa;
						  		}}*/
							  	Account a = new FixedDeposite("deposite",accountNumber,tenure,"SBI4136","SBI",depositeAmount, openingDate);
								//new Customer(cu,a);	
							  	cu.setAc(a);
							  	System.out.println("Account Successfully created for customer");							  	
						  	}
					  		
					  	}
				  		break;
				  	default:
				  		System.out.println("Please Enter valid choice");
				  	}


					
					/*
					 * 		List<Book> books = library.getTotalBooksInLibrary();
		for (Book bk : books) {

			System.out.println("Title : " + bk.title
							+ " and "
							+ " Author : " + bk.author);*/
				  	
			    break;
			  case 3:
					System.out.println("Enter 1.To display Balance & 2.To display Earned Interest");	
					int ch1=sc.nextInt();
					switch(ch1){
					case 1:
					  	System.out.println("Enter Customer Id for whom you want's to display Balance");

					  	temp :
					  	do{
					  	customerId=sc.nextInt();
					  	t=0;
					  	for(Customer cu:customers){
						  	if(customerId==cu.getCustomerId()){
						  		cu.ac.checkBalance();
						  		break temp;
						  	}
						  	t++;	
					  	}
					  	if(customers.size()==t){
						  	System.out.println("Wrong Customer Id Entered, Please Enter Again");				  		
					  	}
					  	}while(customers.size()==t);

						break;
					case 2:
					  	System.out.println("Enter Customer Id for whom you want's to display Earned Interest");

					  	temp :
					  	do{
					  	customerId=sc.nextInt();
					  	t=0;
					  	for(Customer cu:customers){
						  	if(customerId==cu.getCustomerId()){
						  		System.out.println("Earned Interest is: "+cu.ac.calculateInterest());
						  		break temp;
						  	}
						  	t++;	
					  	}
					  	if(customers.size()==t){
						  	System.out.println("Wrong Customer Id Entered, Please Enter Again");				  		
					  	}
					  	}while(customers.size()==t);						
						break;
					default:
				  		System.out.println("Please Enter valid choice");
				
					}
				  break;
			  case 4:
					System.out.println("Enter choice to Sort Customer Data based on: 1.Customer Name's or 2.Bank Balance");	
					int ch3=sc.nextInt();
					switch(ch3){
					case 1:
						System.out.println("Sort by Customer Name:");
						Collections.sort(customers,new NameComparator()); 		//internally calls the compare method
						Iterator<Customer> sn = customers.iterator();
						while(sn.hasNext()) {
							Customer cus = sn.next();
							System.out.println(cus.getCustomerId()+"\t"+cus.getCustomerName()+"\t"+cus.getAge()+"\t"+cus.getMobileNumber()+"\t"+cus.getAadharNumber()+"\t"+cus.getDob()+"\t"+cus.balance);
						}
							
						break;
					case 2:
						System.out.println("Sort by Account Balace:");
						Collections.sort(customers,new BalanceComparator()); 		//internally calls the compare method
						Iterator<Customer> sn1 = customers.iterator();
						while(sn1.hasNext()) {
							Customer cus = sn1.next();
							System.out.println(cus.getCustomerId()+"\t"+cus.getCustomerName()+"\t"+cus.getAge()+"\t"+cus.getMobileNumber()+"\t"+cus.getAadharNumber()+"\t"+cus.getDob()+"\t"+cus.balance);
						}					
						break;
					default:
				  		System.out.println("Please Enter valid choice");
				
					}					
				  break;
			  case 5:
					System.out.println("Enter choice for Persistence needs to be achieved using: 1.File System or 2.DBMS");	
					int ch4=sc.nextInt();
					switch(ch4){
					case 1:
						System.out.println("Persistence needs achieved using: File System:");
						FileStorageDao f=new FileStorageDao();
						f.saveAllCustomers(customers);
						f.retrieveAllCustomers();
							
						break;
					case 2:
						System.out.println("Persistence needs achieved using: DBMS:");
						DatabaseStorageDao d=new DatabaseStorageDao();
						d.saveAllCustomers(customers);
						ArrayList<Customer> cust=new ArrayList<Customer>();
						cust=d.retrieveAllCustomers();		
						for(Customer ct:cust){
							System.out.println(ct);
						}
						break;
					default:
				  		System.out.println("Please Enter valid choice");
				
					}					
				  break; 
			  case 6:
					System.out.println("All Customers Data:\n\n");
			  		System.out.println("[ Id"+"\t"+"Name"+"\t"+"Age"+"\t"+"Mobile_Number"+"\t"+"Aadhar_Number"+"\t"+"DOB"+"\t"+"Account_Number"+"\t"+"IFSC"+"\t"+"Bank_Name"+"\t"+"Balance"+"\t"+"Opening_Date ]");
					for(Customer ct:customers){
						System.out.println(ct);
					}
				  break; 	
			  case 7:
					System.out.println("To Search Customers by Name :");
					
				  	System.out.println("Enter Customer Name to search data:");
				  	int t1=0;
				  	temp :
				  	do{
				  	customerName=sc.next();
				  	t1=0;
				  	for(Customer cu:customers){
					  	if(customerName.equalsIgnoreCase(cu.customerName)){
					  		System.out.println("[ Id"+"\t"+"Name"+"\t"+"Age"+"\t"+"Mobile_Number"+"\t"+"Aadhar_Number"+"\t0000000000"+"DOB"+"\t\t"+"Account_Number"+"\t"+"IFSC"+"\t"+"Bank_Name"+"\t"+"Balance"+"\t"+"Opening_Date ]");
					  		System.out.println(cu);
					  		break temp;
					  	}
					  	t1++;	
				  	}
				  	if(customers.size()==t1){
					  	System.out.println("Wrong Customer Name Entered, Please Enter Again");				  		
				  	}
				  	}while(customers.size()==t1);
				  break; 
			  case 8:
					System.out.println("======================= Exit ======================= ");
					System.exit(0);
				  break; 				  
			  default:
				  	System.out.println("**** Please Enter Valid Choice ****");
				  break;
			  }
			
			
		}
		while(choice!=8);
		sc.close();

	}

}
