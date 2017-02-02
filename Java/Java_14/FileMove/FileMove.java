package Java_14.FileMove;

import java.io.File;

public class FileMove {

	public static void main(String[] args) {
		File myFile = new File("/home/tori/test.txt");
		if(myFile.exists() == false){
			System.out.println("no file");
			return;
		}
		
		File reDir = new File("/home/tori/test");
		reDir.mkdir();
		File reFile = new File(reDir,"test2.txt");
		myFile.renameTo(reFile);
		if(reFile.exists() == true)
			System.out.println("success");
		
	}

}
