package Java_6.BasicInheritance;

class Man{
	private String name;
	public Man(String name){
		this.name = name;
	}
	public void tellYourName(){
		System.out.println(this.name);
	}
}

class BusinessMan extends Man{
	private String company;
	private String position;
	public BusinessMan(String name,String company,String position){
		super(name);
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo(){
		System.out.println(this.company);
		System.out.println(this.position);
		tellYourName();
	}
}

public class BasicInheritance {

	public static void main(String[] args) {
		BusinessMan man1 = new BusinessMan("Hong","one","first");
		BusinessMan man2 = new BusinessMan("Lyoo","two","second");
		
		System.out.print("First = ");
		man1.tellYourInfo();
		System.out.print("Second = ");
		man2.tellYourInfo();
	}

}
