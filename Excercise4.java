package Assignment3;

import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excercise4 {
	Calendar calendar = Calendar.getInstance();

	int hour = calendar.get(Calendar.HOUR_OF_DAY);
	int minute = calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);

	synchronized void hours() {
		try {
			wait();
			if (minute == 60) {
				minute = 0;

				if (hour == 23) {
					hour = 0;
					notify();
				} else {

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized void minutes() {
		try {
			wait();
			if (second == 59) {
				second = 0;
				minute += 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized public void seconds() {
		try {
			wait(1000);
			System.out.println(hour + ":" + minute + ":" + second);
			if (second == 59) {
				notifyAll();
			} else {
				second += 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		Excercise4 obj = new Excercise4();
		
		 ExecutorService es=Executors.newFixedThreadPool(3);
		 
		 es.execute(() -> {
			while(true) {
				obj.seconds();
			}
		 });
		 
		 es.execute(() -> {
			 while(true) {
					obj.minutes();
				}
		 });
		 
		 es.execute(() -> {
			 while(true) {
					obj.hours();
				}
		 });

	}

}
