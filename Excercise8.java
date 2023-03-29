
// ============================ Assignment 8 & 9 ===========================

package Assingment2;

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeValueException extends Exception{
	NegativeValueException(String msg){
		super(msg);
	}
}

class MarkOutOfRangeException extends Exception{
	MarkOutOfRangeException(String msg){
		super(msg);
	}
}
public class Excercise8 {
 public static void main(String[] args)  {
	int[] markArr = new int[10];
	Scanner s = new Scanner(System.in);
	int total = 0;
	
	
	for(int i=0; i<markArr.length ; i++) {
		System.out.println("Enter Mark of subject " + (i+1) + ": ");
		try {
			String value = s.next();

			markArr[i] = (Integer.parseInt(value));

			if(markArr[i] < 0) {
				throw new NegativeValueException("Negative values are not supported");
			}
			else if(markArr[i] > 100) {
				throw new MarkOutOfRangeException("Marks should be not 100");
			}
			total += (markArr[i]);
			
		}catch(NumberFormatException e) {
			i--;
			System.out.println("Invalid form of input");
		}catch(InputMismatchException e) {
			s.next();
			i--;
			System.out.println("miss match input");
		}catch(NegativeValueException e) {
			i--;
			System.out.println(e.getMessage());
		}catch(MarkOutOfRangeException e) {
			i--;
			System.out.println(e.getMessage());
		}
	}
	System.out.println("the avg marks "+total/markArr.length);
}
}
