package Java_7.MyFriendInfoBook;

import java.util.Scanner;

class Friend{
	String name;
	String phoneNum;
	String addr;
	
	public Friend(String name,String phone,String addr){
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}

	public void showData(){
		System.out.println(this.name);
		System.out.println(this.phoneNum);
		System.out.println(this.addr);
	}
	public void showBasicInfo(){
		
	}	
}

class HighFriend extends Friend{
	String job;
	public HighFriend(String name,String phone,String addr,String job){
		super(name, phone, addr);
		this.job = job;
	}
	public void showData(){
		super.showData();
		System.out.println(this.job);
	}
	public void showBasicInfo(){
		System.out.println(super.name);
		System.out.println(super.phoneNum);
	}
}

class UnivFriend extends Friend{
	String major;
	public UnivFriend(String name,String phone,String addr,String major){
		super(name, phone, addr);
		this.major = major;
	}
	public void showData(){
		super.showData();
		System.out.println(this.major);
	}
	public void showBasicInfo(){
		System.out.println(super.name);
		System.out.println(super.phoneNum);
		System.out.println(this.major);
	} 
}


class FriendInfoHandler{
	public static Scanner sc = new Scanner(System.in);
	private Friend[] myFriends;
	private int numOfFriends;
	public FriendInfoHandler(int num){
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	private void addFriendInfo(Friend fren){
		myFriends[numOfFriends++] = fren;		
	}
	public void addFriend(int choice){
		String name,phoneNum,addr,job,major;
		System.out.print("Name : "); name = sc.nextLine();
		System.out.print("Phone : "); phoneNum = sc.nextLine();
		System.out.print("Address : "); addr = sc.nextLine();
		
		if(choice == 1){
			System.out.print("Job : "); job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}
		else if(choice == 2){
			System.out.print("Major : "); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("Inserting was successful");
	}
	
	public void showAllData(){
		for(int i=0;i<numOfFriends;i++){
			myFriends[i].showData();
			System.out.println("");
		}
	}
	
	public void showAllSimpleData(){
		for(int i=0;i<numOfFriends;i++){
			myFriends[i].showBasicInfo();
			System.out.println("");
		}		
	}
}



public class MyFriendInfoBook {

	public static void main(String[] args) {
		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		while(true){
			System.out.println("Menu");
			System.out.println("1.HighSchool Friend Add");
			System.out.println("2.Univ Friend Add");
			System.out.println("3.Print All");
			System.out.println("4.Print Basic Info All");
			System.out.println("5.Quit");
			System.out.println("Choose : ");
			int choice = FriendInfoHandler.sc.nextInt(); 
			FriendInfoHandler.sc.nextLine();
			switch(choice){
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showAllSimpleData();
				break;
			case 5:
				System.out.println("Bye");
				return;
			}
		}
	}

}




















