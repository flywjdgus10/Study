package Java_13.DataBufferFilterPerformance;

import java.io.*;

public class DataBufferFilterPerformance {

	public static void performanceTest(DataOutputStream dataOut) throws IOException{
		long startTime = System.currentTimeMillis();
		for(int i=0;i<1000;i++)
			for(int j=0;j<1000;j++)
				dataOut.writeDouble(12.345);
		dataOut.flush();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
	
	public static void main(String[] args) throws IOException{
		OutputStream out1 = new FileOutputStream("data1.bin");
		DataOutputStream dataOut = new DataOutputStream(out1);
		
		performanceTest(dataOut);
		dataOut.close();
		
		OutputStream out2 = new FileOutputStream("data2.bin");
		BufferedOutputStream buffFilterOut = new BufferedOutputStream(out2);
		DataOutputStream dataBufOut = new DataOutputStream(buffFilterOut);
		performanceTest(dataBufOut);
		dataBufOut.close();
	}

}
