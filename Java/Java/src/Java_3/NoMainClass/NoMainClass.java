package Java_3.NoMainClass;

class Employer{
	private int myMoney;
	public Employer(int money){
		this.myMoney = money;
	}
	
	public void payForWork(Employee emp,int money){
		if(this.myMoney < money)
			return;
		emp.earnMoney(money);
		this.myMoney -= money;
	}
	
	public void showMyMoney(){
		System.out.println(this.myMoney);
	}
}
class Employee{
	private int myMoney;
	public Employee(int money){
		this.myMoney = money;
	}
	public void earnMoney(int money){
		this.myMoney += money;
	}
	public void showMyMoney(){
		System.out.println(this.myMoney);
	}
	public static void main(String[] args){
		Employer emr = new Employer(3000);
		Employee eme = new Employee(0);
		
		emr.payForWork(eme, 1000);
		emr.showMyMoney();
		eme.showMyMoney();
	}
}
/*
public class NoMainClass{

	public static void main(String[] args){
		Employer emr = new Employer(3000);
		Employee eme = new Employee(0);
		
		emr.payForWork(eme, 1000);
		emr.showMyMoney();
		eme.showMyMoney();
	}
}
*/