package Assignment3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Inventory{
	int stock;
	
	public synchronized void prouducer() {
		if(stock != 0) {
			try {wait();}catch(Exception e) {}
		}
		stock++;
		System.out.println("Stock Produced, Now the total stock is : " + stock);
		notify();
	}
	
	
	public synchronized void consumer() {
		  if(stock == 0) {
			  try {wait();}catch(Exception e) {}
		  }
		  
		stock--;
		System.out.println("Stock consumed, Stock remaining is  : " + stock);
		 notify(); 
		
	}
}
public class Excercise3 {
 public static void main(String[] args) {
	 
	 Inventory inventory = new Inventory();
	 ExecutorService es=Executors.newFixedThreadPool(2);
	 
	 es.execute(() -> {
		 for(int i=0;i<5;i++)
		 inventory.prouducer();
	 });
	 
	 es.execute(() -> {
		 for(int i=0;i<5;i++)
		 inventory.consumer();
	 });
	 
	 es.shutdown();
 }
}


// https://www.geeksforgeeks.org/java-notify-method-in-threads-synchronization-with-examples/
// https://stackoverflow.com/questions/7126550/java-wait-and-notify-illegalmonitorstateexception