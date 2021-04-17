package innerClasses;

abstract class Person {
	/*Person(String str){
		System.out.println("I am in constructor !!!"+str);
	}*/
	abstract void eat();
	abstract void test(); 
	abstract void process(); 
}
abstract class MyClass1{
	
	abstract void myMethod();
}

class ExAnonymus1 {
	public static void main(String args[]) {
		
		// Create anonymus class to provide implemetation to Person
		Person p = new Person() {
			@Override
			void eat() {
				System.out.println("nice fruits");
			}

			@Override
			void test() {
				System.out.println("I am in test method !!!");

			}

			@Override
			void process() {
				System.out.println("Process method implementation..");
			}
		};
		p.eat();
		p.test();
		p.process();
		
	// Create anonymus class to MyClass to provide implementation
		
		MyClass1 m=new MyClass1() {
			
			@Override
			void myMethod() {
				System.out.println("Hello........");
				
			}
		};
		m.myMethod();
	}
}  
