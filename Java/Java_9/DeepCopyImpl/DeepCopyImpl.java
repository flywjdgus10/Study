package Java_9.DeepCopyImpl;

class Business implements Cloneable{
	private String company;
	private String work;
	
	public Business(String company,String work){
		this.company = company;
		this.work = work;
	}
	
	public void showBusinessInfo(){
		System.out.println(this.company + " " + this.work);
	}
	
	public void changeWork(String work){
		this.work = work;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class PersonalInfo implements Cloneable{
	private String name;
	private int age;
	private Business bness;
	
	PersonalInfo(String name,int age,String work,String company) {
		this.name = name;
		this.age = age;
		this.bness = new Business(company, work);
	}
	public void showPersonInfo(){
		System.out.println(this.name + " " + this.age);
		bness.showBusinessInfo();
	}
	public void changeWork(int age,String work){
		this.age = age;
		bness.changeWork(work);
	}

	public Object clone() throws CloneNotSupportedException{
		PersonalInfo cpy = (PersonalInfo)super.clone();
		cpy.bness = (Business)bness.clone();
		return cpy;
	}
}

public class DeepCopyImpl {

	public static void main(String[] args) {
		try{
			PersonalInfo p1 = new PersonalInfo("Lyoo", 11, "a", "A");
			PersonalInfo cpy = (PersonalInfo)p1.clone();
			p1.changeWork(13,"C");
			p1.showPersonInfo();
			cpy.showPersonInfo();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
	}

}
