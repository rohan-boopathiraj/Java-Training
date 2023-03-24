package Assignment3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excercise1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		// To display odd numbers
		es.execute(()->{
			for(int i=1; i <= 100; i+=2) 
				System.out.println("Odd number " + i);
		});
		
		// To display even numbers
		es.execute(()->{
			for(int i=2; i <= 100; i+=2) 
				System.out.println("Even number " + i);
		});
		
		es.shutdown();
	}
}
