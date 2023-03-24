package Assingment7;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
     
        int countWords = str.split("\\s").length;
        System.out.println("total no of words : " + countWords);
        scanner.close();

    }
}
