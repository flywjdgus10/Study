package Java_5.TwoDimensionalArrayAdder;

public class TwoDimensionalArrayAdder {
	public static void addOneDArr(int[] arr,int add){
		for(int i=0;i<arr.length;i++)
			arr[i] += add;		
	}
	public static void addTwoDArr(int[][] arr,int add){
		for(int i=0;i<arr.length;i++)
			addOneDArr(arr[i], add);		
	}
	public static void main(String[] args) {
		int[][] ar = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		addTwoDArr(ar,6);
		for(int i=0;i<ar.length;i++)
			for(int j=0;j<ar[i].length;j++)
				System.out.println(ar[i][j]);
	}

}
