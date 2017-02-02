package Java_8.LocalClassTest;

interface Readable{
	public void read();
}

class OuterClass{
	private String myName;
	
	OuterClass(String name) {
		this.myName = name;
	}
	
	public Readable createLocalClassInst(){
		class LocalClass implements Readable{
			public void read(){
				System.out.println(myName);
			}
		}
		return new LocalClass();
	}
}

public class LocalClassTest {

	public static void main(String[] args) {
		OuterClass out1 = new OuterClass("First");
		Readable localInst1 = out1.createLocalClassInst();
		OuterClass out2 = new OuterClass("Second");
		Readable localInst2 = out2.createLocalClassInst();
		localInst1.read();
		localInst2.read();
	}

}
