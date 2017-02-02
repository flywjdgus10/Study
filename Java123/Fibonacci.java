import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){			
			if(i == 0 || i == 1)
				arr[i] = 1;
			else
				arr[i] = arr[i-1] + arr[i-2];			
		}		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);		
		sc.close();
	}
}
