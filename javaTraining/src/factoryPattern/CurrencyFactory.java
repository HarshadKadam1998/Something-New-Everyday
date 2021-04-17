package factoryPattern;

public class CurrencyFactory {
	public static Currency getCurrency(String c){
	    if(c == null){
			return null;
		}
	    else if(c.equalsIgnoreCase("euro")){
			return new Euro();
		}
		else if(c.equalsIgnoreCase("dollar")){
			return new Dollar();
		}
		else if(c.equalsIgnoreCase("rupees")){
			return new Rupees();
		}
		return null;
	}
}
