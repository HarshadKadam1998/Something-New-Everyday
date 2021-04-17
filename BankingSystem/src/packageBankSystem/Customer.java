package packageBankSystem;

//import java.util.List;

import java.util.Comparator;
import java.io.Serializable;

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int currentId=100;
	private int customerId;
	String customerName;
	private int age;
	private int mobileNumber;
	private String aadharNumber;
	Account ac;
	private String dob;
	transient double balance;
	//Customer(Customer c,Account ac) { c.ac = ac; }


	public Customer( String customerName, int age,int mobileNumber,String aadharNumber,String dob ){
		this.customerId=currentId++;
		this.customerName=customerName;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.aadharNumber=aadharNumber;
		this.dob=dob;
	}
	public void setAc(Account ac) {
		this.ac = ac;
		this.balance=ac.balance;
	}

	public String getDob() {
		return dob;
	}
	
	public static int getCurrentId() {
		return currentId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getAge() {
		return age;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}
	// Getting Account of customer	
	public Account getAccount()
	{
		return ac;
	}	
	@Override
	public String toString(){
		return "[ "+customerId+"\t"+customerName+"\t"+age+"\t"+mobileNumber+"\t"+aadharNumber+"\t"+dob+"\t"+ac.accountNumber+"\t"+ac.ifscCode+"\t"+ac.bankName+"\t"+ac.balance+"\t"+ac.openingDate+" ]";
		//return "Customer[ Id="+customerId+", Name="+customerName+", Age="+age+", Mobile Number="+mobileNumber+", Aadhar Number="+aadharNumber+", DOB="+dob+", Account Number="+ac.accountNumber+", IFSC="+ac.ifscCode+", Bank Name="+ac.bankName+", Balance="+ac.balance+", Opening Date="+ac.openingDate+"]";
	}

}

class NameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer arg0, Customer arg1) {
		return arg0.customerName.compareTo(arg1.customerName);
	}
	
}


class BalanceComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer arg0, Customer arg1) {
		if(arg0.balance == arg1.balance)
			return 0;
		else if(arg0.balance > arg1.balance)
			return 1;
		else 
			return -1;
	}
	
}






