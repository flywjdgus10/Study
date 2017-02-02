package Java_10.IntroGenericArray;

public class IntroGenericArray {
	public static <T>void showArrayData(T[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);					
	}
	public static void main(String[] args) {
		String[] stArr = new String[]{
				"Hi","I'm so happy","Java Generic Programming"
		};
		Integer[] intArr = new Integer[3];
		intArr[0] = new Integer(1);
		intArr[1] = new Integer(2);
		intArr[2] = new Integer(3);
		
		
		showArrayData(stArr);
		showArrayData(intArr);
	}

}
