package Java_14.TransientMembers;

import java.io.*;

class PersonalInfo implements Serializable{
	String name;
	transient String secretInfo;
	int age;
	transient int secretNum;
	
	PersonalInfo(String name,String sInfo,int age,int sNum){
		this.name = name;
		this.secretInfo = sInfo;
		this.age = age;
		this.secretNum = sNum;		
	}
	
	public void showCircleInfo(){
		System.out.println(this.name + " " + this.secretInfo + " " + this.age + " " + this.secretNum);
	}
}

public class TransientMembers {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Personal.ser"));
		
		PersonalInfo info = new PersonalInfo("A", "A A", 3, 33);
		info.showCircleInfo();
		out.writeObject(info);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Personal.ser"));
		PersonalInfo recovInfo = (PersonalInfo)in.readObject();
		in.close();
		
		recovInfo.showCircleInfo();
	}

}
