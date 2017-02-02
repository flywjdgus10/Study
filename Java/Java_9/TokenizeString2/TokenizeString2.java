package Java_9.TokenizeString2;
import java.util.StringTokenizer;
public class TokenizeString2 {

	public static void main(String[] args) {
		String phoneNum = "TEL 1-2-3-4-5";
		String javaCode = "num+=1";
		
		StringTokenizer st1 = new StringTokenizer(phoneNum);
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		
		st1 = new StringTokenizer(phoneNum,"-");
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		
		st1 = new StringTokenizer(javaCode,"+=",true);
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken());
	}

}
