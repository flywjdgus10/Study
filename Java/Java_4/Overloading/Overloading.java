package Java_4.Overloading;

class Person{
	private int perID;
	private int milID;
	
	public Person(int pID,int mID){
		this.perID = pID;
		this.milID = mID;
	}
	public Person(int pID){
		this.perID = pID;
		this.milID = 0;
	}
	public void showInfo(){
		System.out.println(this.perID);
		if(this.milID != 0)
			System.out.println(this.milID);
		else
			System.out.println("no milID");
	}
}
public class Overloading {

	public static void main(String[] args) {
		Person man = new Person(950123,880102);
		Person woman = new Person(941125);
		man.showInfo();
		woman.showInfo();
	}

}
