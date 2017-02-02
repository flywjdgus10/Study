package Java_11.SetInterfaceFeature;

import java.util.Iterator;
import java.util.HashSet;

public class SetInterfaceFeature {

	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		
		hSet.add("11");
		hSet.add("22");
		hSet.add("33");
		hSet.add("44");
		hSet.add("55");
		
		Iterator<String> itr = hSet.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
