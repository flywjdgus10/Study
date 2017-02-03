package Java_9.AboutStaticWrapping;

public class AboutStaticWrapping {

	public static void main(String[] args) {
		Integer iValue1 = Integer.valueOf(3);
		Integer iValue2 = Integer.valueOf(3);
		
		if(iValue1 == iValue2)
			System.out.println("same");
	}

}
