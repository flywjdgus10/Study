package Java_8.LocalParamClassTest;

interface Readable{
	public void read();
}

class OuterClass{
	private String myName;
	OuterClass(String name) {
		this.myName = name; 
	}
	
	public Readable createLocalClassInst(final int instID){
		class LocalClass implements Readable{
			public void read(){
				System.out.println(myName);
				System.out.println(instID);
			}
		}
		return new LocalClass();
	}
}

public class LocalParamClassTest {

	public static void main(String[] args) {
		OuterClass out = new OuterClass("LEE");
		Readable localInst1 = out.createLocalClassInst(111);
		Readable localInst2 = out.createLocalClassInst(222);
		localInst1.read();
		localInst2.read();
	}

}
