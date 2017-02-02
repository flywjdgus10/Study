package Java_9.ObjectEquality;

class IntNumber{
	int num;
	public IntNumber(int num){
		this.num = num;
	}
	public boolean isEquals(IntNumber numObj){
		if(this.num == numObj.num)
			return true;
		else
			return false;
	}
	public boolean equals(Object obj){
		if(this.num == ((IntNumber)obj).num)
			return true;
		else
			return false;
	}
}

public class ObjectEquality {
	public static void main(String[] args){
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.isEquals(num2))
			System.out.println("1");
		else
			System.out.println("2");
		
		if(num1.equals(num3))
			System.out.println("3");
		else
			System.out.println("4");
	}
}
