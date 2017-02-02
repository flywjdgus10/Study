package Java_8.ThrowsFromMain;

import java.util.Scanner;
@SuppressWarnings("serial")
class AgeInputException extends Exception{
	public AgeInputException(){
		super("error");
	}
}

public class ThrowsFromMain {

	public static void main(String[] args) throws AgeInputException{
		int age = readAge();
	}
	
	public static int readAge() throws AgeInputException{
		Scanner keyboard = new Scanner(System.in);
		int age = keyboard.nextInt();
		if(age < 0){
			AgeInputException excpt = new AgeInputException();
			throw excpt;
		}
		return age;
	}

}
