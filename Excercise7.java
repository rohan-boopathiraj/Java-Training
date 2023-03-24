package Assignment3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excercise7 {

	static void count() {
		for(int i = 1; i< 101; i++) {
			
			if(i % 10 == 0) {
				System.out.println("Every tenth element skipped");
			}
			else {
				System.out.println(i);
			}
			
			// Waiting for 1 second
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es =  Executors.newFixedThreadPool(1);
		es.execute(() -> {
			count();
		});
		
	}

}
