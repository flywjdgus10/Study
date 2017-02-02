package Java_3.Encapsulation1;

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
class ColdPatient{
	public void takeSinivelCap(SinivelCap cap){
		cap.take();
	}
	public void takeSneezeCap(SneezeCap cap){
		cap.take();
	}
	public void takeSnuffleCap(SnuffleCap cap){
		cap.take();
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		ColdPatient sufferer = new ColdPatient();
		sufferer.takeSinivelCap(new SinivelCap());
		sufferer.takeSneezeCap(new SneezeCap());
		sufferer.takeSnuffleCap(new SnuffleCap());
	}

}
