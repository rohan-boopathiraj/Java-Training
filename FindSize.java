package fileOperations7;

import java.io.File;

public class FindSize {

	public static void main(String[] args) {
		File file = new File("src/fileOperations7/oldFile.txt");
		System.out.println(file.length()+ " bytes");
	}

}
