package Java_9.TokenizeString;
import java.util.StringTokenizer;
public class TokenizeString {

	public static void main(String[] args) {
		String strData = "1:2:3:4:5";
		StringTokenizer st = new StringTokenizer(strData,":");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
