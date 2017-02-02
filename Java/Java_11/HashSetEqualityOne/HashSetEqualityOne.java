package Java_11.HashSetEqualityOne;

import java.util.Iterator;
import java.util.HashSet;


class SimpleNumber{
	int num;
	SimpleNumber(int n) {
		this.num = n;
	}
	public String toString(){
		return String.valueOf(this.num);
	}
}

public class HashSetEqualityOne {

	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		
		System.out.println(hSet.size());
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
