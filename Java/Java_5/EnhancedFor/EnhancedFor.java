package Java_5.EnhancedFor;

public class EnhancedFor {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum=0;
		
		for(int e : arr)
			sum+=e;
		System.out.println(sum);
		
		for(int e : arr){
			e++;
			System.out.print(e+" ");
		}
		System.out.println();
		for(int e : arr)
			System.out.print(e+" ");

	}

}
