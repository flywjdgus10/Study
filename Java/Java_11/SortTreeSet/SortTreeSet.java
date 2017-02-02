package Java_11.SortTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class SortTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> sTree = new TreeSet<Integer>();
		sTree.add(3);
		sTree.add(2);
		sTree.add(1);
		sTree.add(4);
		System.out.println(sTree.size());
		Iterator<Integer> itr = sTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
