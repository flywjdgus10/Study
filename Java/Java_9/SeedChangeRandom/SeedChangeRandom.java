package Java_9.SeedChangeRandom;
import java.util.*;
public class SeedChangeRandom {

	public static void main(String[] args) {
		Random rand = new Random(12);
		rand.setSeed(System.currentTimeMillis());
		
		for(int i=0;i<10;i++)
			System.out.println(rand.nextInt(10));
	}

}
