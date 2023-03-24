package Assingment7;

import java.io.File;

public class ListDir {

	public static void main(String[] args) {
		File file = new File(args[0]);
		String[] directory = file.list();
		
		for(int i = 0; i < directory.length; i++) {
			System.out.println(directory[i]);
		}
		
	}

}
