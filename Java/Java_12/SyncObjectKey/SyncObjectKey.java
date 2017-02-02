package Java_12.SyncObjectKey;

class IHaveTwoNum{
	int num1=0;
	int num2=0;
	
	public void addOneNum1(){
		this.num1++;
	}
	public void addTwoNum1(){
		this.num1++;
		this.num1++;
	}
	public void addOneNum2(){
		this.num2++;
	}
	public void addTwoNum2(){
		this.num2++;
		this.num2++;
	}
	
	public void showAllNums(){
		System.out.println(this.num1);
		System.out.println(this.num2);
	}
}

class AccessThread extends Thread{
	IHaveTwoNum twoNumInst;
	AccessThread(IHaveTwoNum inst){
		this.twoNumInst = inst;
	}
	public void run(){
		twoNumInst.addOneNum1();
		twoNumInst.addTwoNum1();
		twoNumInst.addOneNum2();
		twoNumInst.addTwoNum2();
	}
}

public class SyncObjectKey {

	public static void main(String[] args) {
		IHaveTwoNum numInst = new IHaveTwoNum();
		
		AccessThread at1 = new AccessThread(numInst);
		AccessThread at2 = new AccessThread(numInst);
		
		at1.start();
		at2.start();
		
		try{
			at1.join();
			at2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		numInst.showAllNums();
	}

}
