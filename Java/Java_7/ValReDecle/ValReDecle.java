package Java_7.ValReDecle;

class AAA{
	public int num = 2;
}
class BBB extends AAA{
	public int num = 5;
}
class CCC extends BBB{
	public int num = 7;
}

public class ValReDecle {
	public static void main(String[] args){
		CCC ref1 = new CCC();
		BBB ref2 = ref1;
		AAA ref3 = ref1;
		
		System.out.println(ref1.num);
		System.out.println(ref2.num);
		System.out.println(ref3.num);
	}
}
