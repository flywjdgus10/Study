package Java_9.RandomBetween;
import java.util.*;
public class RandomBetween {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int min = sc.nextInt();
		
		for(int i=0;i<9;i++)
			System.out.println(rand.nextInt(max-min+1)+min);

		for(int i=0;i<5;i++)
			System.out.println(rand.nextDouble());
	}

}
