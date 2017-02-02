package Java_10.BoundedTypeParam;

interface SimpleInterface{
	public void showYourName();
}

class UpperCase{
	public void showYourAncestor(){
		System.out.println("UpperClass");
	}
}

class AAA extends UpperCase implements SimpleInterface{
	public void showYourName(){
		System.out.println("ClassAAA");
	}
}

class BBB extends UpperCase implements SimpleInterface{
	public void showYourName(){
		System.out.println("ClassBBB");
	}
}

public class BoundedTypeParam {

	public static <T>void showInstanceAncestor(T param){
		((SimpleInterface)param).showYourName();
	}
	public static <T>void showInstanceName(T param){
		((UpperCase)param).showYourAncestor();
	}
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		showInstanceName(aaa);
		showInstanceName(bbb);
		showInstanceAncestor(aaa);
		showInstanceAncestor(bbb);
	}

}
