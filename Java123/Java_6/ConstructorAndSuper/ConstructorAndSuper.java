package Java_6.ConstructorAndSuper;

class Car{
	private int gasolineGauge;
	public Car(int gasoline){
		this.gasolineGauge = gasoline;		
	}
	public void showGasoline(){
		System.out.println(this.gasolineGauge);
	}
}
class HybridCar extends Car{
	private int eletricGauge;
	public HybridCar(int gasoline,int eletric){ 
		super(gasoline);
		this.eletricGauge = eletric;
	}
	public void showElectric(){
		System.out.println(this.eletricGauge);
	}
}

class HybridWaterCar extends HybridCar{
	private int waterGauge;
	
	public HybridWaterCar(int gasoline,int eletric,int water){
		super(gasoline,eletric);
		this.waterGauge = water;
	}
	
	public void showCurrentGauge(){
		showGasoline();
		showElectric();
		System.out.println(this.waterGauge);
	}
}


public class ConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hwCar = new HybridWaterCar(1, 2, 3);
		hwCar.showCurrentGauge();
	}
}
