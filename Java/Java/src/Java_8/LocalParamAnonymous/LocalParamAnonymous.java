package Java_8.LocalParamAnonymous;

interface Readable{
	public void read();
}

class OuterClass{
	private String myName;
	
	OuterClass(String name){
		this.myName = name;
	}
	
	public Readable createLocalClassInst(final int instID){
		return new Readable(){
			public void read(){
				System.out.println(myName);
				System.out.println(instID);
			}
		};
	}
}

public class LocalParamAnonymous {

	public static void main(String[] args) {
		OuterClass out = new OuterClass("Lee");
		Readable localInst1 = out.createLocalClassInst(111);
		Readable localInst2 = out.createLocalClassInst(222);
		localInst1.read();
		localInst2.read();
	}

}
