package theradsEx;

class Th1 {

	synchronized void shared(int n) {// method synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
	
//	 void shared(int n) {// method not synchronized
////	// synchronized(this) {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(n * i);
//			try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
//	 //}
//
//	}

}  
  
class MyThread1 extends Thread {
	Th1 t;

	MyThread1(Th1 t) {
		this.t = t;
	}

	public void run() {
		t.shared(3);
	}

}  

class MyThread2 extends Thread {
	Th1 t;

	MyThread2(Th1 t) {
		this.t = t;
	}

	public void run() {
		t.shared(10);
	}
}  
  
class ExThreadWithOutSync {
	public static void main(String args[]) {
		Th1 obj = new Th1();// only one object
		//Th1 obj1 = new Th1();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t2.start();
		t1.start();
		
		/*Th1 obj2=new Th1();
		MyThread1 t3 = new MyThread1(obj2);
		MyThread2 t4 = new MyThread2(obj2);*/
		/*try {
			t1.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}  

