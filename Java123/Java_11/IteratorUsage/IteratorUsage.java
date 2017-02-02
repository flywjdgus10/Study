package Java_11.IteratorUsage;

import java.util.Iterator;
import java.util.LinkedList;
public class IteratorUsage {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Forth");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			String curStr = itr.next();
			System.out.println(curStr);
			if(curStr.compareTo("Third")==0)
				itr.remove();
		}
		
		
		itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
