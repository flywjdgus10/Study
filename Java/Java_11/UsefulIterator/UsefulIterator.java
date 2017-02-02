package Java_11.UsefulIterator;

import java.util.Iterator;
import java.util.HashSet;

public class UsefulIterator {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()){
			String curStr = itr.next();
			System.out.println(curStr);
			if(curStr.compareTo("Third")==0)
				itr.remove();
		}
		
		itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
