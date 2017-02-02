package Java_9.WrappingInteger;

class IntWrapper{
	private int num;
	public IntWrapper(int data){
		this.num = data;
	}
	
	public String toString(){
		return ""+this.num;
	}
}

public class WrappingInteger {
	
	public static void showData(Object obj){
		System.out.println(obj);
	}

	public static void main(String[] args) {
		IntWrapper intInst = new IntWrapper(3);
		Integer intInst1 = new Integer(10);
		showData(intInst);
		showData(new IntWrapper(7));
		showData(intInst1);
	}

}
