package Java_9.MathClass;
import java.math.*;
public class MathClass {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.toDegrees(Math.PI));
		System.out.println(Math.toDegrees(Math.PI*2.0));
		
		double radian45 = Math.toRadians(45);
		System.out.println(Math.sin(radian45));
		System.out.println(Math.cos(radian45));
		System.out.println(Math.tan(radian45));
		
		System.out.println(Math.log(25));
		System.out.println(Math.pow(2, 4));
	}

}
