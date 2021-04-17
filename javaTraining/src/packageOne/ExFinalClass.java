package packageOne;

class MyClass{
	final int passbookNumber=1488;
	
	 void method(){
		System.out.println("final method cant be inherited");
	}
}
public class ExFinalClass extends MyClass {

	//final int passbookNumber=1488;
	final static String pan="ashjf73";
	final int passbookNumber2;
	final static String pan2;
	ExFinalClass(){
		passbookNumber2=57683;
	}
	static{
		pan2="dshfj56";
	}
	void method(){
		
		System.out.println("final mehod check");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExFinalClass obj=new ExFinalClass();
		System.out.println("final variable initialized:"+obj.passbookNumber);
		System.out.println("final static variable initialized:"+ExFinalClass.pan);
//		System.out.println("final variable initialized:"+obj.passbookNumber2);
		System.out.println("final variable initialized:"+ExFinalClass.pan2);
		obj.method();
	}

}
