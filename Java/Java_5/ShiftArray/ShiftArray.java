package Java_5.ShiftArray;

public class ShiftArray {

	public static void change(int[][] ar){
		int[] temp;		
		for(int i=ar.length-1;i>0;i--)
		{
			temp = ar[i];
			ar[i] = ar[i-1];
			ar[i-1] = temp;
		}
			
	}
	public static void swap(int[] arr1,int[] arr2){
		
	}
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		change(arr);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

}
