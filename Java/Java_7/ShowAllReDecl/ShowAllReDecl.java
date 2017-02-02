package Java_7.ShowAllReDecl;

class AAA{
	public int num = 2;
}
class BBB extends AAA{
	public int num = 5;
	public void showSuperNum(){
		System.out.println(super.num);
	}
}
class CCC extends BBB{
	public int num = 7;
	public void showAllNums(){
		super.showSuperNum();
		System.out.println(super.num);
		System.out.println(num);
	}
}

public class ShowAllReDecl {

	public static void main(String[] args) {
		CCC ref = new CCC();
		ref.showAllNums();
	}

}
