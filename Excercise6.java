package Assignment3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excercise6 {
	static String s = "rohan12rohan";
	static int count;

	static void countChar() {
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.toString(s.charAt(i)).matches("^[a-zA-Z]*$")) {
				System.out.println(s.charAt(i));
				count++;
			}
			else {
				try{
				throw new Exception();
				}catch(Exception e){
					System.out.println("Input should of type character not alpha-numeric");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es =  Executors.newFixedThreadPool(1);
		es.execute(() -> {
			countChar();
			System.out.println(count);
		});
		
	
		
	}

}
