package Java_4.CstOverloading;

class Person{
	private int perID;
	private int milID;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	
	public Person(int pID,int mID,int bYear,int bMonth,int bDay){
		this.perID = pID;
		this.milID = mID;
		this.birthYear = bYear;
		this.birthMonth = bMonth;
		this.birthDay = bDay;
	}
	public Person(int pID,int bYear,int bMonth,int bDay){
		this(pID,0,bYear,bMonth,bDay);
	}
	
	public void showInfo(){
		System.out.println(this.perID);
		if(this.milID != 0)
			System.out.println(this.milID + " " + this.birthYear + " " + this.birthMonth + " " + this.birthDay);
		else
			System.out.println("no milID");
	}
}

public class CstOverloading {

	public static void main(String[] args) {
		Person man = new Person(951203, 880102, 1995, 12 , 3);
		Person woman = new Person(991107, 1999, 11, 7);
		man.showInfo();
		woman.showInfo();
	}

}
