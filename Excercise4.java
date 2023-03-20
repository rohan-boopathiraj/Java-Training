package Assignment3;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excercise4 {
	static void clock() {
		
		LocalDateTime d = LocalDateTime.now();
		int hour = d.getHour();
		int minute = d.getMinute();
		int second = d.getSecond();

		 try {
		   while (true) {

		     System.out.printf("%02d : %02d : %02d ", hour, minute, second);
		     System.out.println();

		     second++;

		     if (second == 60) {
		       minute += 1;
		       second = 0;
		     }
		     if (minute == 60) {
		       hour += 1;
		       minute = 0;
		     }
		     if (hour == 24) {
		       hour = 0;
		       minute = 0;
		       second = 0;
		     }

		     Thread.sleep(1000);
		   }
		 } catch (Exception e) {
		   System.out.println(e);
		 }
	}
	
	
public static void main(String[] args) {
	
	 ExecutorService es=Executors.newFixedThreadPool(2);
	 es.execute(() -> {
		 clock();
	 });

}
}

