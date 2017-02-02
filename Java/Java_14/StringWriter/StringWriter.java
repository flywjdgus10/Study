package Java_14.StringWriter;

import java.io.*;

public class StringWriter {

	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
		
		out.write("a");
		out.newLine();
		out.write("b");
		out.newLine();
		out.write("c");
		out.newLine();
		out.write("d");
		out.close();
	}

}
