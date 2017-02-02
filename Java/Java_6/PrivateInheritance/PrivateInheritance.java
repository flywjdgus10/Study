package Java_6.PrivateInheritance;

class Accumulator{
	private int val;
	public Accumulator(int init){
		this.val = init;
	}
	protected void accumulate(int num){
		if(num<0) return;
		this.val += num;
	}
	protected int getAccVal(){
		return this.val;
	}
}

class SavingAccount extends Accumulator{
	
	public SavingAccount(int initDep){ 
		super(initDep);
	}
	
	public void saveMoney(int money){
		accumulate(money);
	}
	
	public void showSaveMoney(){
		System.out.println(getAccVal());
	}
}

public class PrivateInheritance {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1000);
		sa.saveMoney(1000);
		sa.saveMoney(1000);
		sa.showSaveMoney();
	}

}
