package Assignment3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excercise2 {
	
	 synchronized static void displayMsg(String msg) {
		System.out.println("[--------" + msg + "--------]");
	}
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		
		es.execute(()->{
			//Thread 1 function call
			displayMsg("Thread 1 called");
		});
		
		es.execute(()->{
			//Thread 2 function call
			displayMsg("Thread 2 called");
		});
		
		es.execute(()->{
			//Thread 3 function call
			displayMsg("Thread 3 called");
		});
		
		es.execute(()->{
			//Thread 4 function call
			displayMsg("Thread 4 called");
		});
		
		es.shutdown();
	}
}
