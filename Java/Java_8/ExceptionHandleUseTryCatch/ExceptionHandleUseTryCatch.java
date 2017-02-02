package Java_8.ExceptionHandleUseTryCatch;

import java.util.Scanner;

public class ExceptionHandleUseTryCatch {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr = new int[100];
		for(int i=0;i<3;i++){
			try{
				System.out.print("Num1 = ");
				int num1 = keyboard.nextInt();
				System.out.print("Num2 = ");
				int num2 = keyboard.nextInt();

				System.out.print("Index = ");
				int idx = keyboard.nextInt();
				
				arr[idx] = num1/num2;
				System.out.println(arr[idx]);
				System.out.println(idx);
			}catch(ArithmeticException e){
				System.out.println("error1");
				i-=1;
				continue;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("error2");
				i-=1;
				continue;
			}
		}
			
	}

}
