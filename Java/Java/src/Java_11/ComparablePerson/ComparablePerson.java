package Java_11.ComparablePerson;

import java.util.Iterator;
import java.util.TreeSet;


class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void showData(){
		System.out.println(this.name+" "+this.age);
	}
	
	public int compareTo(Person p){
		if(this.age > p.age)
			return 1;
		else if(this.age < p.age)
			return -1;
		else
			return 0;
	}
}

public class ComparablePerson {

	public static void main(String[] args) {
		TreeSet<Person> sTree = new TreeSet<Person>();
		sTree.add(new Person("Lee", 24));
		sTree.add(new Person("Park", 25));
		sTree.add(new Person("Kim", 23));
		
		Iterator<Person> itr = sTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
