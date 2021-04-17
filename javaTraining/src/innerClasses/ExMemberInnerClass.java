package innerClasses;


//Outer class
class ExMemberInnerClass {  
	private int data = 30;
	String name="Java";
	
	ExMemberInnerClass(){
		System.out.println("Outer class constructor !!!");
	}
	void display(){
		System.out.println(" Instance method from outer class.. ");
		
	}

	//Member Inner class
	class InnerClass {
		int y;
		InnerClass(){
			System.out.println("Inner class constructor !!!");
		}
		void msg() {
			System.out.println("Instance method from Inner class");
			System.out.println("data is " + data);
			System.out.println("Name="+name);
			//display();
			}
		//display();
	}
	
	//class InnerClass2 { }

	public static void main(String args[]) {
		ExMemberInnerClass e=new ExMemberInnerClass();
		e.display();
		//e.msg();
		InnerClass in=e.new InnerClass();
		in.msg();
	
		//in.display();
		
	}
} 