package Java_11.IntroArrayList;
import java.util.ArrayList;

public class IntroArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(11));
		list.add(new Integer(22));
		list.add(new Integer(33));
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		list.remove(1);

		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}
