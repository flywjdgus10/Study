package Java_9.StringEquals;


public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("First");
		String str2 = new String("First");
		
		if(str1 == str2)
			System.out.println("Same");
		else
			System.out.println("Different");
		
		if(str1.equals(str2))
			System.out.println("Same");
		else
			System.out.println("Different");
	}

}
