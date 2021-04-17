package packageBankSystem;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class SavingsAccount extends Account {


	boolean isSalaryAccount;
	double minBalance=5000.00;
	int years;
	double interest;
	public SavingsAccount(String type,Boolean isSalaryAccount,long accountNumber, String ifscCode, String bankName, double balance, String openingDate) {
		super(type,accountNumber, ifscCode, bankName, balance, openingDate);
		// TODO Auto-generated constructor stub
		this.isSalaryAccount=isSalaryAccount;
		minBalance=balance;

	}

	public SavingsAccount(String type,long accountNumber, String ifscCode, String bankName, double balance, String openingDate) {
		super(type,accountNumber, ifscCode, bankName, balance, openingDate);
		// TODO Auto-generated constructor stub
		minBalance=balance;

	}
	
	@Override
	public double calculateInterest() {
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDateTime now = LocalDateTime.now();
		String openingDateArr[]=super.openingDate.split("/");    
	    String currentDate=(String)(dtf.format(now));
		String [] currentDateArr=currentDate.split("/");  
		years=(Integer.parseInt(currentDateArr[2])-Integer.parseInt(openingDateArr[2]));		
		// TODO Auto-generated method stub
		interest=balance*years*0.04;
		return interest;
	}


	
	public void deosite(double amount){
		this.balance+=amount;
	}
	
	public void withdraw(double amount){
		if(isSalaryAccount==true){
			this.balance-=amount;
			System.out.println(" Amount of "+amount+" has been Successfully Withdrawn.");
			checkBalance();	
		}else{
			double temp=0;
			temp=balance-amount;
			if(temp<5000){
				System.out.println("This is non-salary account minimum balace should be 5000.");
				System.out.println("Only excess amount of"+(balance-5000)+"is there and could be withdrawn.");
			}
			else{
				this.balance-=amount;
				System.out.println(" Amount of "+amount+" has been Successfully Withdrawn.");
				checkBalance();				
			}
		}
		
	}
	
	public void checkBalance(){
		System.out.println("Current Account Balance is: "+this.balance);
	}	
	
	
}
