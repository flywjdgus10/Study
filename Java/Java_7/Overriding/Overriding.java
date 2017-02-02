package Java_7.Overriding;

class Speaker{
	private int volumeRate;
	public void showCurrentState(){
		System.out.println(this.volumeRate);
	}
	public void setVolume(int vol){
		this.volumeRate = vol;
	}
}

class BaseEnSpeaker extends Speaker{
	private int baseRate;
	public void showCurrentState(){
		super.showCurrentState();
		System.out.println(this.baseRate);
	}
	public void setBaseRate(int base){
		this.baseRate = base;
	}
}

public class Overriding {

	public static void main(String[] args) {
		BaseEnSpeaker bs = new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
	}

}
