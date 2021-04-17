package theradsEx;

class Thread1 extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			try{
				sleep(2000);
				System.out.println("Thread1: "+i);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			try{
				sleep(3000);
				System.out.println("Thread2: "+i);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

public class TreadUsingTreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		System.out.println(t1.getState());
		System.out.println(t2.getState());		
		t1.start();
		t2.start();
//		t1.run();
//		t2.run();
		System.out.println(t1.getState());
		System.out.println(t2.getState());
	}

}
