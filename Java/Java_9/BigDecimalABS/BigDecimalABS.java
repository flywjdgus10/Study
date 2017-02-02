package Java_9.BigDecimalABS;
import java.math.*;
import java.util.Scanner;
public class BigDecimalABS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal e1 = new BigDecimal(sc.nextLine());
		BigDecimal e2 = new BigDecimal(sc.nextLine());
		System.out.println(e1.subtract(e2).abs());
	}

}
