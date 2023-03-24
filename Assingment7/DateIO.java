package Assingment7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Date;

public class DateIO {

	public static void main(String[] args) throws Exception {
		Date date = new Date();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Assingment7/Date.txt"));
		PrintWriter printWriter = new PrintWriter("src/Assingment7/Date.txt");
		
		// Writing to a file
		printWriter.print(date);
		printWriter.flush();
		
		// Reading from a file
		System.out.println((bufferedReader.readLine()));
		System.out.println(date);
		
		bufferedReader.close();
		printWriter.close();

	}

}
