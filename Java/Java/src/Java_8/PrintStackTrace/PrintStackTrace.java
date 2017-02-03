package Java_8.PrintStackTrace;

import java.util.Scanner;

class AgeInputException extends Exception{
	public AgeInputException(){
		super("error1");
	}
}

class NameLengthException extends Exception{
	String wrongName;
	public NameLengthException(String name){
		super("error2");
		this.wrongName = name;
	}
	public void showWrongName(){
		System.out.println(this.wrongName);
	}
}

class PersonInfo{
	String name;
	int age;
	
	public PersonInfo(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void showPersonInfo(){
		System.out.println(this.name + " " + this.age);
	}
}

public class PrintStackTrace {
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		try{
			PersonInfo readInfo = readPersonInfo();
			readInfo.showPersonInfo();
		}catch(AgeInputException e){
			e.printStackTrace();
		}catch(NameLengthException e){
			e.showWrongName();
			e.printStackTrace();
		}
	}

	public static PersonInfo readPersonInfo()
	throws AgeInputException,NameLengthException{
		String name = readName();
		int age = readAge();
		PersonInfo pInfo = new PersonInfo(name, age);
		return pInfo;
	}
	
	
	public static String readName() throws NameLengthException{
		System.out.println("Input name = ");
		String name = keyboard.nextLine();
		if(name.length() < 2)
			throw new NameLengthException(name);
		return name;
	}
	public static int readAge() throws AgeInputException{
		System.out.println("Input age = ");
		int age = keyboard.nextInt();
		if(age < 0)
			throw new AgeInputException();
		return age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
