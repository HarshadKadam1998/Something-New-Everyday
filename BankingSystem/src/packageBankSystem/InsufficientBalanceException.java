package packageBankSystem;

public class InsufficientBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;
	public InsufficientBalanceException(String description){
		this.description=description;
	}
	
	public String getException(){
		return description;
	}

}
