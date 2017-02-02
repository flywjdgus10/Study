package Java_11.HashSetEqualityTwo;

import java.util.Iterator;
import java.util.HashSet;

class SimpleNumber{
	int num;
	SimpleNumber(int n){
		this.num = n;
	}
	
	public String toString(){
		return String.valueOf(this.num);
	}
	
	public int hashCode(){
		return this.num%3;
	}
	
	public boolean equals(Object obj){
		SimpleNumber comp = (SimpleNumber)obj;
		if(this.num == comp.num)
			return true;
		else
			return false;
	}
}


public class HashSetEqualityTwo {

	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(40));
		hSet.add(new SimpleNumber(40));
		System.out.println(hSet.size());
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}

























