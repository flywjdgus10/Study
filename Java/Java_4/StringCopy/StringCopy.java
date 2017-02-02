package Java_4.StringCopy;

public class StringCopy {

	public static void main(String[] args) {
		String str1 = "Lemon";
		String str2 = "Lemon";
		String str3 = new String(str2);
		
		if(str1 == str2)
			System.out.println("same");
		else 
			System.out.println("different");
		

		if(str2 == str3)
			System.out.println("same");
		else 
			System.out.println("different");
	}

}
