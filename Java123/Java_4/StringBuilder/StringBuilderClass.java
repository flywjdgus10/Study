package Java_4.StringBuilder;

public class StringBuilderClass {

	public static void main(String[] args) {
		String str = "ABC";
		String str1 = "1-2";
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb1.length());
		System.out.println(sb.reverse().toString());
		sb.replace(0, 3, str1);
		System.out.println(sb.deleteCharAt(1).toString());
	}

}
