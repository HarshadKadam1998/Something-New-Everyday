package theradsEx;

class Thread11 extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			try{
				//sleep(2000);
				System.out.println("Thread1: "+i);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class Thread22 implements Runnable{
	public void run(){
		for(int i=0;i<=5;i++){
			try{
				//sleep(3000);
				System.out.println("Thread2: "+i);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}



public class ThreadUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread11 t11=new Thread11();
		Thread22 t22=new Thread22();
		Thread t=new Thread(t22);
		System.out.println(t11.getState());
		System.out.println(t.getState());		
		t11.start();
		t.start();
//		t1.run();
//		t2.run();
		System.out.println(t11.getState());
		System.out.println(t.getState());
	}

}
