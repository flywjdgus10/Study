package Java_10.BoundedTypeParam2;


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

public class BoundedTypeParam2 {
	public static <T extends SimpleInterface>void showInstanceName(T param){ 
		param.showYourName();
	}
	public static <T extends UpperCase>void showInstanceAncestor(T param){
		param.showYourAncestor();
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
