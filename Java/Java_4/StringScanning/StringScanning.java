package Java_4.StringScanning;

import java.util.Scanner;


public class StringScanning {

	public static void main(String[] args) {
		String source = "1 5 7";
		Scanner sc = new Scanner(source);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		
		System.out.printf("%d + %d + %d = %d\n",num1,num2,num3,sum);
		sc.close();

	}

}
