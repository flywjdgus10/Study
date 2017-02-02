package Java_2.ClassPath;

class AAA{
	public void printName(){
		System.out.println("AAA");
	}
}
class BBB{
	public void printName(){
		System.out.println("BBB");
	}
}
public class ClassPath {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.printName();
		
		BBB bbb = new BBB();
		bbb.printName();
		
	}

}
