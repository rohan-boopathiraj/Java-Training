package Assingment2;

import java.util.Scanner;

public class Excercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
			
			String numerator = s.next();
			
			if(numerator.equals("Q") || numerator.equals("q")) {
				break;
			}
			String divisor = s.next();
			
			try {
				int num = Math.abs(Integer.parseInt(numerator));
				int divi = Math.abs(Integer.parseInt(divisor));
				
				if(divi == 0) {
					throw new ArithmeticException("Division by zero");
				}
				else {
					System.out.println(num/divi);
				}
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("poor input data");
			}
		}

	}

}
