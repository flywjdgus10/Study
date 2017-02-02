package Java_8.MultiInheriAlternative;

interface Computer{
	public void dataReceive();
}

class TV{
	public void onTV(){
		System.out.println("TV");
	}
}

class ComputerImpl{
	public void dataReceive(){
		System.out.println("Comp");
	}
}

class IPTV extends TV implements Computer{
	ComputerImpl comp = new ComputerImpl();
	public void dataReceive(){
		comp.dataReceive();
	}
	public void powerOn(){
		dataReceive();
		onTV();
	}
}

public class MultiInheriAlternative {

	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		TV tv = iptv;
		Computer comp = iptv;
	}

}
