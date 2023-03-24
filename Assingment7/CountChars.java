package Assingment7;

import java.util.Scanner;

public class CountChars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		while(true){	
			try {
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				count++;
			}
			System.out.println(count);
			str= scanner.next();
			}
			catch(Exception e) {
				System.out.println("Count failed");
				
			}
			finally {
				scanner.close();
			}
		}
		
		}

	}

