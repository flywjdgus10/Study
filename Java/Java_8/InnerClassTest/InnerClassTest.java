package Java_8.InnerClassTest;

class OuterClass{
	private String myName;
	private int num;
	
	OuterClass(String name) {
		this.myName = name;
		this.num = 0;
	}
	
	public void whoAreYou(){
		num++;
		System.out.println(this.myName + " OuterClass " + num);
	}
	class InnerClass{
		InnerClass() {
			whoAreYou();
		}
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		OuterClass out1 = new OuterClass("First");
		OuterClass out2 = new OuterClass("Second");
		out1.whoAreYou();
		out2.whoAreYou();
		
		OuterClass.InnerClass inn1 = out1.new InnerClass();
		OuterClass.InnerClass inn2 = out2.new InnerClass();
		OuterClass.InnerClass inn3 = out1.new InnerClass();
		OuterClass.InnerClass inn4 = out1.new InnerClass();
		OuterClass.InnerClass inn5 = out2.new InnerClass();
		
	}

}
