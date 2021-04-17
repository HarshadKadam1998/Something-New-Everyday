package theradsEx;

class ThreadA extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("ThreadA=" + i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class ThreadB extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("ThreadB="+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}
}

public class ExJoinThread  {
	
	public static void main(String args[]) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		t1.start();
		
		try {
			
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
	}
}  
