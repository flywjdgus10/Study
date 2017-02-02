package Java_7.ISAInheritance;

class Computer{
	private String owner;
	public Computer(String name){
		this.owner = name;
	}
	public void calculate(){
		System.out.println("Calculate");
	}
}

class NotebookComp extends Computer{
	private int battery;
	
	public NotebookComp(String name,int initChag){
		super(name);
		this.battery = initChag;
	}
	public int getBattey(){
		return this.battery;
	}
	public void useBattery(){
		this.battery--;
	}
	public void charging(){
		this.battery += 5;
	}
	public void movingCal(){
		if(this.battery < 1){
			System.out.println("Need charging");
			return;
		}
		
		System.out.print("Moving ");
		super.calculate();
		this.battery -= 1;
	}
}

class TabletNotebook extends NotebookComp{
	private String regstPenModel;
	public TabletNotebook(String name,int initChag,String pen){
		super(name, initChag);
		this.regstPenModel = pen;		
	}
	public void write(String penInfo){
		if(super.getBattey() < 1){
			System.out.println("Need charging");
			return;
		}
		if(this.regstPenModel.compareTo(penInfo) != 0){
			System.out.println("Not registered pen");
			return;
		}
		
		System.out.println("Execute the work");
		super.useBattery();
	}
}

public class ISAInheritance {

	public static void main(String[] args) {
		NotebookComp nc = new NotebookComp("Lee",5);
		TabletNotebook tn = new TabletNotebook("Jung", 5, "123");
		
		nc.movingCal();
		tn.write("123");
	}

}
