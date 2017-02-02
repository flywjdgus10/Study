package Java_7.HASComposite;

class Gun{
	protected int bullet;
	public Gun(int bnum) {
		this.bullet = bnum;
	}
	public void shot(){
		System.out.println("BBANG!!");
		this.bullet--;
	}
}

class Police{
	private int handcuffs;
	private Gun pistol;
	public Police(int bnum,int bcuff){
		this.handcuffs = bcuff;
		if(bnum != 0)
			pistol = new Gun(bnum);
		else
			pistol = null;
	}
	public void putHandcuff(){
		System.out.println("SNAP!!");
		this.handcuffs--;
	}
	public void shot(){
		if(pistol == null)
			System.out.println("Hut BBANG!");
		else
			pistol.shot();
	}
}

public class HASComposite {

	public static void main(String[] args) {
		Police haveGun = new Police(5, 3);
		haveGun.shot();
		haveGun.putHandcuff();
		
		Police dontHaveGun = new Police(0, 3);
		dontHaveGun.shot();
	}

}
