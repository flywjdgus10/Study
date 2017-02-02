package Java_5.ArrayMinMax;

import java.util.Scanner;

public class ArrayMinMax {

	public static int minValue(int[] arr){
		int temp = arr[0];
		int i;
		for(i=1;i<arr.length;i++)
			if(temp > arr[i])
				temp = arr[i];
		return temp;
	}
	public static int maxValue(int[] arr){
		int temp = arr[0];
		int i;
		for(i=1;i<arr.length;i++)
			if(temp < arr[i])
				temp = arr[i];
		return temp;
	}
	
	public static void main(String[] args) {
		int[] array = new int[3];
		int min;
		int max;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<array.length;i++)
			array[i] = sc.nextInt();
		max = maxValue(array);
		min = minValue(array);
		System.out.printf("%d %d\n",max,min);
		sc.close();
	}

}
