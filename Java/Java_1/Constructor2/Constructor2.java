package Java_1.Constructor2;


class Number{
	int num;
	
	public Number(int num){
		this.num = num;
	}
	public int getNumber(){
		return this.num;
	}
}
public class Constructor2 {

	public static void main(String[] args) {
		Number num1 = new Number(10);
		Number num2 = new Number(20);
		
		System.out.println(num1.getNumber());
		System.out.println(num2.getNumber());

	}

}
