package Java_13.ByteBufferedFileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteBufferedFileCopy {

	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("org.bin");
		OutputStream out = new FileOutputStream("cpy.bin");
		
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		
		int copyByte = 0;
		int bData;
		
		while(true){
			bData = bin.read();
			if(bData == -1)
				break;
			bout.write(bData);
			copyByte++;
		}
		in.close();
		out.close();
		System.out.println(copyByte);
		
	}

}
