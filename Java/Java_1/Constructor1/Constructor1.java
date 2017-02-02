package Java_1.Constructor1;


class Number{
	int num;
	public Number(){
		this.num = 0;
		System.out.println("constructor was called");
	}
	public int getNumber(){
		return this.num;
	}
}
public class Constructor1 {
	public static void main(String args[]){
		Number num1 = new Number();
		Number num2 = new Number();
		System.out.println(num1.getNumber());
		System.out.println(num2.getNumber());
	}
}
