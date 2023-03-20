package Assignment3;

public class Excercise5 extends Thread {
	
	public void run() {
		System.out.println("Thread Started");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		
		t1.start();
		t1.start();

	}

}
