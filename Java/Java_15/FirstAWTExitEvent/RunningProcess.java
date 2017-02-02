package Java_15.FirstAWTExitEvent;

import java.io.*;

public class RunningProcess {

	public static void main(String[] args) throws IOException, InterruptedException{
		Process proc = Runtime.getRuntime().exec("java Java_15.FirstAWTExitEvent.FirstAWTExitEvent");
		proc.waitFor();
		
		if(proc.exitValue() == 0)
			System.out.println("Success");
		else
			System.out.println("Fail");
	}

}
