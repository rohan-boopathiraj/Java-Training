package fileOperations7;

import java.io.File;

public class RenameOperation {

	public static void main(String[] args) {
		File oldFile = new File("src/fileOperations7/newFile.txt");
		
		File newFile = new File("src/fileOperations7/oldFile.txt");
		
		if(oldFile.renameTo(newFile)) {
			System.out.println("File renamed to : "+ newFile.getName());
		}else {
			System.out.println("Failed to rename the file");
		}
		
		
	}

}
