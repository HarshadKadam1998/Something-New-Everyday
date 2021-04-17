package packageBankSystem;

public class FixedDeposite extends Account {

	double depositeAmount;
	int tenure;
	double earnedIntrest;
	public FixedDeposite(String type,long accountNumber,int tenure, String ifscCode, String bankName, double depositeAmount, String openingDate) {
		super(type,accountNumber, ifscCode, bankName, depositeAmount, openingDate);
		// TODO Auto-generated constructor stub
		this.tenure=tenure;
		this.depositeAmount=depositeAmount;
	}
	public FixedDeposite(String type,long accountNumber, String ifscCode, String bankName, double depositeAmount, String openingDate) {
		super(type,accountNumber, ifscCode, bankName, depositeAmount, openingDate);
		// TODO Auto-generated constructor stub
		this.depositeAmount=depositeAmount;
	}
	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
			earnedIntrest=depositeAmount*tenure*0.04;			
		return earnedIntrest;
	}
	public void checkBalance(){
		System.out.println("Current Account Balance is: "+this.depositeAmount);
	}		


}
