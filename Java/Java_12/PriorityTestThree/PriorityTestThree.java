package Java_12.PriorityTestThree;


class MessageSendingThread extends Thread{
	String message;
	MessageSendingThread(String str,int prio){
		this.message = str;
		setPriority(prio);		
	}
	
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(this.message + " " + getPriority());
			
			try{
				sleep(1);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
}

public class PriorityTestThree {

	public static void main(String[] args) {
		MessageSendingThread tr1 = new MessageSendingThread("First",Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("Second",Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("Third",Thread.MIN_PRIORITY);
		tr1.start();
		tr2.start();
		tr3.start();


	}

}
