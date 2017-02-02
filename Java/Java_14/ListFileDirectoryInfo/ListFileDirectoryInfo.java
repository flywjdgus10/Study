package Java_14.ListFileDirectoryInfo;

import java.io.*;

public class ListFileDirectoryInfo {

	public static void main(String[] args) {
		File myDir = new File("src");
		File[] list = myDir.listFiles();
		
		for(int i=0;i<list.length;i++){
			System.out.print(list[i].getName());
			if(list[i].isDirectory())
				System.out.println("\t \t DIR");
			else
				System.out.println("\t \t FILE");
		}
		System.out.println(System.getProperty("java.version"));
	}

}
