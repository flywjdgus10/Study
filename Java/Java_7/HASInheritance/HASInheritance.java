package Java_7.HASInheritance;

class Gun{
	protected int bullet;
	public Gun(int bnum){
		this.bullet = bnum;
	}
	public void shot(){
		System.out.println("BBANG!!");
		bullet--;
	}
}

class Police extends Gun{
	protected int handcuffs;
	public Police(int bnum,int bcuff){
		super(bnum);
		this.handcuffs = bcuff;
	}
	public void putHandcuff(){
		System.out.println("SNAP!!");
		this.handcuffs--;
	}
}

public class HASInheritance {

	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shot();
		pman.putHandcuff();
	}

}
