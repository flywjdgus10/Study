package Java_8.AbstractInterface;

abstract class PersonalNumberStorage{
	public abstract void addPersonalInfo(String name,String perNum);
	public abstract String searchName(String perNum);
}

class PersonalNumInfo{
	String name;
	String number;
	
	PersonalNumInfo(String name,String number) {
		this.name = name;
		this.number = number;
	}
	String getName(){
		return this.name;
	}
	String getNumber(){
		return this.number;
	}
}

class PersonalNumberStorageImpl extends PersonalNumberStorage{
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int sz){
		perArr = new PersonalNumInfo[sz];
		numOfPerInfo = 0;
	}
	public void addPersonalInfo(String name,String perNum){
		perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
		numOfPerInfo++;
	}
	public String searchName(String perNum){
		for(int i=0;i<numOfPerInfo;i++)
			if(perNum.compareTo(perArr[i].getNumber()) == 0)
				return perArr[i].getName();
		return null;
	}
}

public class AbstractInterface {

	public static void main(String[] args) {
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		storage.addPersonalInfo("Kim", "1234");
		storage.addPersonalInfo("Lee", "5678");
		
		System.out.println(storage.searchName("1234"));
		System.out.println(storage.searchName("5678"));
	}

}
