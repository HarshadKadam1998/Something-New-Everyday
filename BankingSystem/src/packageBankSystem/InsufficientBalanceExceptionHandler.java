package packageBankSystem;

public class InsufficientBalanceExceptionHandler {
	public static void checkMinBalanceRequirement(double balance)throws InsufficientBalanceException{
		
		if(balance<5000.00){
			throw new InsufficientBalanceException("Exception: Insufficient Balance for Account Creation, Minimum Balance Requirement is 5000");
		}

	}

			//System.out.println(e.getException());
}
