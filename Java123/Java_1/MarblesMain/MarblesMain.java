package Java_1.MarblesMain;

class ChildProperty{
	int numOfBead;
	public ChildProperty(int Bead){
		this.numOfBead= Bead;
	}
	public void obtainBead(ChildProperty child,int obtainCount){
		int obtainBeadCount = child.loseBead(obtainCount);
		this.numOfBead += obtainBeadCount;
	}
	public int loseBead(int loseCount){
		if(this.numOfBead<loseCount){
			int retValue = this.numOfBead;
			this.numOfBead = 0;
			return retValue;
		}
		
		this.numOfBead -= loseCount;
		return loseCount;		
	}
	
	public void showResult(){
		System.out.println(this.numOfBead);
	}
}

public class MarblesMain {

	public static void main(String[] args) {
		ChildProperty ch1 = new ChildProperty(15);
		ChildProperty ch2 = new ChildProperty(9);
		
		ch1.showResult();
		ch2.showResult();
		
		ch1.obtainBead(ch2, 2);
		ch2.obtainBead(ch2, 7);
		

		ch1.showResult();
		ch2.showResult();
		
	}

}
