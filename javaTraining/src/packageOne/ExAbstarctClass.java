package packageOne;
abstract class parent1{
	public  parent1(){
		
	}
	abstract int getRusult();
	public void display(){
		System.out.println("Display method called.");
	}
	public static void test(){
		System.out.println("Test method called");
	}
}

class ExAbstarctClass extends parent1{

		int getRusult(){
		System.out.println("getResult method called");
		return 1;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 obj=new ExAbstarctClass();
		obj.getRusult();
		obj.display();
		parent1.test();
		

	}

}
