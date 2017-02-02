package Java_14.RandomFileReadWrite;

import java.io.*;

public class RandomFileReadWrite {

	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("data.bin", "rw");
		System.out.println("1. "+raf.getFilePointer());
		raf.writeInt(200);
		raf.writeInt(500);
		System.out.println("2. "+raf.getFilePointer());
		
		raf.writeDouble(48.65);
		raf.writeDouble(52.24);
		System.out.println("3. "+raf.getFilePointer());
		
		raf.seek(0);
		System.out.println("4. "+raf.getFilePointer());
		
		System.out.println(raf.readInt());
		System.out.println(raf.readInt());
		System.out.println("5. "+raf.getFilePointer());
		
		System.out.println(raf.readDouble());
		System.out.println(raf.readDouble());
		System.out.println("6. "+raf.getFilePointer());
		
		raf.close();
	}

}

