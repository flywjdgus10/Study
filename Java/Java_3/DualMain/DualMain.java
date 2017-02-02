package Java_3.DualMain;

class AAA{
	int aaa;
	public AAA(int num){
		this.aaa = num;
	}
	
	public static void main(String[] args){
		AAA ins1 = new AAA(10);
		BBB ins2 = new BBB(20);
		System.out.println(ins1.aaa);
		System.out.println(ins2.bbb);
	}
}
class BBB{
	int bbb;
	public BBB(int num){
		this.bbb = num;
	}
	public static void main(String[] args){
		AAA ins1 = new AAA(10);
		BBB ins2 = new BBB(20);
		System.out.println(ins1.aaa);
		System.out.println(ins2.bbb);		
	}
}