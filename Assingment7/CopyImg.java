package Assingment7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImg {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(InputStream inputStream = new FileInputStream("src/Assingment7/pollachi.png");
			OutputStream outputStream = new FileOutputStream("src/Assingment7/profile.png")){
			
			byte[] buffer = new byte[2000];
			int bytesRead;
			while((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer,0,bytesRead);
			}
			System.out.println("Image copied");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
