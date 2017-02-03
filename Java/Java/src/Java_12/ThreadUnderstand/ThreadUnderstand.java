package Java_12.ThreadUnderstand;


class ShowThread extends Thread{
	String threadName;
	ShowThread(String name){
		this.threadName = name;
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(this.threadName);
			try{
				sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class ThreadUnderstand {

	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("First");
		ShowThread st2 = new ShowThread("Second");
		st1.start();
		st2.start();
	}

}
