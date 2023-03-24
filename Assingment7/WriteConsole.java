package Assingment7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;

public class WriteConsole {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Assingment7/file1.txt"));
		PrintWriter printWriter = new PrintWriter(System.out);
		
		String line;
		
		while((line = bufferedReader.readLine()) != null) {
			printWriter.println(line);
			printWriter.flush();
		}
		
		bufferedReader.close();
	
	}

}
