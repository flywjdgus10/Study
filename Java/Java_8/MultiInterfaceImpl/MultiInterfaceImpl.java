package Java_8.MultiInterfaceImpl;

interface Computer{
	public void dataReceive();
}

interface TV{
	public void onTV();
}

class ComputerImpl{
	public void dataReceive(){
		System.out.println("Comp");
	}
}
class TVImpl{
	public void onTV(){
		System.out.println("TV");
	}
}

class IPTV implements TV,Computer{
	ComputerImpl comp = new ComputerImpl();
	TVImpl tv = new TVImpl();
	public void dataReceive(){
		comp.dataReceive();
	}
	public void onTV(){
		tv.onTV();
	}
	public void powerOn(){
		dataReceive();
		onTV();
	}
}

public class MultiInterfaceImpl {

	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		TV tv = iptv;
		Computer comp = iptv;
	}

}
