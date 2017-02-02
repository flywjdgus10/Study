package Java_3.Encapsulation2;


class SinivelCap{
	public void take(){
		System.out.println("SnivelCap");
	}
}
class SneezeCap{
	public void take(){
		System.out.println("SneezeCap");
	}
}
class SnuffleCap{
	public void take(){
		System.out.println("SnuffleCap");
	}
}

class CONTAC600{
	SinivelCap sin;
	SneezeCap sne;
	SnuffleCap snu;
	public CONTAC600(){
		sin = new SinivelCap();
		sne = new SneezeCap();
		snu = new SnuffleCap();
	}
	public void take(){
		sin.take();
		sne.take();
		snu.take();
	}
}
class ColdPatient{
	public void takeCONTAC600(CONTAC600 cap){
		cap.take();
	}
}
public class Encapsulation2 {

	public static void main(String[] args) {
		ColdPatient sufferer = new ColdPatient();
		sufferer.takeCONTAC600(new CONTAC600());
	}

}
