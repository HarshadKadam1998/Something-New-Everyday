package innerClasses;

public class ExLocalClass {

	private int data = 30; // instance variable
	static String s="Java";
	final int age=25;
	
	ExLocalClass(){
		System.out.println("Default Outer class constructor !!!");
	}

	void display() {
		/**
		 * Local variable can't be private, public or protected. 
		 * Local inner class cannot access non-final local variable till JDK 1.7. 
		 * Since Java8, local classes can access all local variables
		 */

		 final int x = 100;
		 int y=50;
		 class Local {
			Local(){
				System.out.println("Default constructor of the local class");
			}
			void msg() {
				System.out.println(data);
				System.out.println(x);
				System.out.println(y);
				System.out.println(s);
				System.out.println(age);
			}
		} // end of local classDefault Local class constructor !!!
		Local l = new Local();
		l.msg();
		System.out.println("End of the local inner class..");
	} // end of the instance method..

	public static void main(String args[]) {
		ExLocalClass obj = new ExLocalClass();
		obj.display();
		//obj.new Local();
		
	}
}  