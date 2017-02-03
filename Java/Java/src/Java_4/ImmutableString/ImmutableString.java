package Java_4.ImmutableString;



public class ImmutableString {

	public static void main(String[] args) {
		String str1 = "Test";
		String str2 = "Test";
		String str3 = "Test2";
		if(str1 == str2)
			System.out.println("Same");
		else
			System.out.println("Different");
		
		if(str1 == str3)
			System.out.println("Same");
		else
			System.out.println("Different");
	}

}
