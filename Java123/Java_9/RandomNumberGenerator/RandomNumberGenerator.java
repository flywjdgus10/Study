package Java_9.RandomNumberGenerator;
import java.util.*;
public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i=0;i<10;i++)
			System.out.println(rand.nextInt(1000));
	}

}
