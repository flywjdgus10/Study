package Java_4.SelfReference;

class SimpleAdder{
	private int num;
	public SimpleAdder(){
		this.num = 0;
	}
	public SimpleAdder add(int num){
		this.num += num;
		return this;
	}
	public void showResult(){
		System.out.println(this.num);
	}
}
public class SelfReference {

	public static void main(String[] args) {
		SimpleAdder adder = new SimpleAdder();
		adder.add(1).add(3).add(5).showResult();
	}
}
