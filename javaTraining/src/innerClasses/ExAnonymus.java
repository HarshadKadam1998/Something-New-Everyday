package innerClasses;

abstract class ExAbstract {
	
	abstract void display();
	void process() {
		System.out.println("Implementation method...");
	}
}


//class ChildClass extends ExAbstractClass{
//	public void display() {
//		System.out.println("Implementation of abstract method");
//	}
//	
//}

public class ExAnonymus {

	public static void main(String[] args) {
		
		ExAbstract e = new ExAbstract() {
			
			@Override
			void display() {
				System.out.println("Method implementation....");
			}
			
		};
		
		e.display();
		e.process();

	}

}

