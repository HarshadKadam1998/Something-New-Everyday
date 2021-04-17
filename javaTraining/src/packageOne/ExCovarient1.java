package packageOne;

class Fruit1{
	
	Fruit1 display(int x){
		System.out.println("Parent..");
		return this;
	}
	float demo(float k){
		System.out.println("demo method from parent class");
		return k;
	}
}

public class ExCovarient1 extends Fruit1{
	
	@Override
	ExCovarient1 display(int y){
		System.out.println("Child..");
		return this;
		
	}
	
	@Override
	float demo(float p){
		System.out.println("demo method from child class");
		return 20;
	}

	public static void main(String[] args) {

		ExCovarient1 e=new ExCovarient1();
		Fruit1 obj=e.display(100);	//	Fruit1 obj=new ExCovarient1();
		obj.display(300);
		int result=(int)obj.demo(100);
		System.out.println("Result="+result);
		
	}

}
