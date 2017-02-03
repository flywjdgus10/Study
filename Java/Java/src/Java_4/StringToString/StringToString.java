package Java_4.StringToString;

class Friend{
	private String myName;
	public Friend(String name){
		this.myName = name;
	}
	
	public String toString(){
		return "My name is " + this.myName;
	}
	
}

public class StringToString {
	public static void main(String[] args) {
		Friend fnd1 = new Friend("Lee");
		Friend fnd2 = new Friend("Hyun");
		
		System.out.println(fnd1);
		System.out.println(fnd2);
		System.out.print(fnd1);
		System.out.print(fnd2);
	}
}
