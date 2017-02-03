package Java_12.ThreadSyncMethod;

class Calculator{
	int opCnt = 0;
	public int add(int n1,int n2){
		this.opCnt++;
		return n1+n2;
	}
	
	public synchronized int min(int n1,int n2){
		this.opCnt++;
		return n1-n2;
	}
	
	public synchronized void showOpCnt(){
		System.out.println(this.opCnt);
	}
}

class AddThread extends Thread{
	Calculator cal;
	AddThread(Calculator cal) {
		this.cal = cal;
	}
	
	public void run(){
		System.out.println(cal.add(1, 2));
		System.out.println(cal.add(2, 4));
	}
}

class MinThread extends Thread{
	Calculator cal;
	MinThread(Calculator cal) {
		this.cal = cal;
	}
	public void run(){
		System.out.println(cal.min(2, 1));
		System.out.println(cal.min(4, 2));
	}
}

public class ThreadSyncMethod {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);
		at.start();
		mt.start();
		
		try{
			at.join();
			mt.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		cal.showOpCnt();
	}

}
