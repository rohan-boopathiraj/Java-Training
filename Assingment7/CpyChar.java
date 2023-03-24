package Assingment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CpyChar {

	public static void main(String[] args) throws IOException {
		int line;

		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Assingment7/file3.txt"));
			PrintWriter printWriter = new PrintWriter(new File("src/Assingment7/file4.txt"));
			while ((line = bufferedReader.read()) != -1) {
				printWriter.write((char) line);
				printWriter.flush();
			}
			bufferedReader.close();
			System.out.println("File copied");
		} catch (Exception e) {
			System.out.println("File copy failed");
		}
		
	}

}
