package Java_11.ComparableMyString;

import java.util.TreeSet;
import java.util.Iterator;


class MyString implements Comparable<MyString>{
	String str;
	MyString(String str) {
		this.str = str;
	}
	public int getLength(){
		return str.length();
	}
	
	public int compareTo(MyString mStr){
		if(getLength() > mStr.getLength())
			return 1;
		else if(getLength() < mStr.getLength())
			return -1;
		else
			return 0;
	}
	public String toString(){
		return this.str;
	}
}

public class ComparableMyString {

	public static void main(String[] args) {
		TreeSet<MyString> tSet = new TreeSet<MyString>();
		tSet.add(new MyString("Orange"));
		tSet.add(new MyString("Grape11"));
		tSet.add(new MyString("Apple"));
		
		System.out.println(tSet.size());
		Iterator<MyString> itr = tSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
