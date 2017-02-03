package Java_8.FinallyTest;


public class FinallyTest {

	public static void main(String[] args) {
		boolean divOK = divider(4,2);
		if(divOK)
			System.out.println("success");
		else
			System.out.println("false");
		
		divOK = divider(4, 0);
		if(divOK)
			System.out.println("success");
		else
			System.out.println("false");
		
	}
	
	public static boolean divider(int num1,int num2){
		try{
			int result = num1/num2;
			System.out.println(result);
			return true;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			return false;
		}finally{
			System.out.println("Finally");
		}
		
	}
}
