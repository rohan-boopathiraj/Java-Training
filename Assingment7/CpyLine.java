package Assingment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CpyLine {

	public static void main(String[] args) throws IOException {
		String line;
		try {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Assingment7/file1.txt"));
		PrintWriter printWriter = new PrintWriter(new File("src/Assingment7/file2.txt"));
		
		while((line = bufferedReader.readLine()) != null) {
			printWriter.write(line);
			printWriter.flush();
		}
		System.out.println("File copied");
		bufferedReader.close();
		}catch(Exception e) {
			System.out.println("Copy failed");
		}
	}

}
