package fileOperations7;

import java.io.File;
import java.io.IOException;

public class DeleteOperation {

	public static void main(String[] args) throws IOException {
		File file = new File("src/fileOperations7/dlt.txt");
		
		file.createNewFile();
		
		if(file.delete()) {
			System.out.println("File Deleted : "+ file.getName());
		}
		else {System.out.println("Failed to delete the file");}
		
		
	}

}
