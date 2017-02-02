package Java_5.TwoDimenArray;

public class TwoDimenArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				arr[i][j] = i+j;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		
		
		
	}

}
