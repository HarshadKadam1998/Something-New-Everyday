package factoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency c1=CurrencyFactory.getCurrency("Dollar");
		c1.displayCurrency();
		
		Currency c2=CurrencyFactory.getCurrency("RUPEES");
		c2.displayCurrency();
		
		Currency c3=CurrencyFactory.getCurrency("euro");
		c3.displayCurrency();
		
		Currency c4=CurrencyFactory.getCurrency("Dinar");
		//c4.displayCurrency();
		if(c4==null){
			System.out.println("default implementation");
		
		Currency c5=CurrencyFactory.getCurrency(null);
		if(c5==null){
				System.out.println("There is no respective object in factory class");			
		}
	}

}}
