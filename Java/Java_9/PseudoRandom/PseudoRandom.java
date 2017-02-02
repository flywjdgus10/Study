package Java_9.PseudoRandom;
import java.util.*;
public class PseudoRandom {

	public static void main(String[] args) {
		Random rand = new Random(12);
		
		for(int i=0;i<10;i++)
			System.out.println(rand.nextInt(1000));
		
	}	

}
