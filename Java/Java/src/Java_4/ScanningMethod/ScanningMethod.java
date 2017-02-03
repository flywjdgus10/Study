package Java_4.ScanningMethod;

import java.util.Scanner;

public class ScanningMethod {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your name?");
		String str = keyboard.nextLine();
		System.out.println("Welcome, " + str);
		
		System.out.print("Do you like spagetti? Is it true?");
		boolean isTrue = keyboard.nextBoolean();
		if(isTrue == true)
			System.out.println("Oh, me too!!");
		else
			System.out.println("How about trying??");
		
		System.out.print("How tall are you and your brother?");
		double num1 = keyboard.nextInt();
		double num2 = keyboard.nextInt();
		double idff = num1 - num2;
		if(idff > 0)
			System.out.println("Your are taller than your bro");
		else
			System.out.println("Your are smaller than your bro");
		
		keyboard.close();

	}

}
