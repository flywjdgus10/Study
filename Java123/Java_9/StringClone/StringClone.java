package Java_9.StringClone;

class Person implements Cloneable{
	private String name;
	private int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void changeName(String name){
		this.name = name;
	}
	
	public void showPersonInfo(){
		System.out.println(this.name + " " + this.age);
	}
	
	public Object clone() throws CloneNotSupportedException{
		Person cpy = (Person)super.clone();
		return cpy;
	}
}

public class StringClone {

	public static void main(String[] args) {
		try{
			Person p1 = new Person("Lee", 22);
			Person p2 = (Person)p1.clone();
			p2.changeName("Park");
			Person p3 = (Person)p2.clone();
			p3.changeName("Lyoo");
			
			p1.showPersonInfo();
			p2.showPersonInfo();
			p3.showPersonInfo();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}

}
