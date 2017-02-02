package Java_11.HashSetQuestion;

import java.util.HashSet;
import java.util.Iterator;



class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return this.name + " " + this.age;
	}
	
	public int hashCode(){
		return age%3 + this.name.hashCode();
	}
	
	public boolean equals(Object obj){
		Person comp = (Person)obj;
		if(comp.name.compareTo(this.name) == 0 &&
				comp.age == this.age)
			return true;
		else
			return false;	
		
	}
}

public class HashSetQuestion {

	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("Lee", 10));
		hSet.add(new Person("Lee", 20));
		hSet.add(new Person("Kim", 20));
		hSet.add(new Person("Kim", 15));
		hSet.add(new Person("Lee", 20));
		hSet.add(new Person("Kim", 20));
		
		System.out.println(hSet.size());
		Iterator<Person> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
