package Java_11.PrimitiveCollection;
import java.util.Iterator;
import java.util.LinkedList;
public class PrimitiveCollection {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
