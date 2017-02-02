package Java_12.ConditionSyncStringReadWrite;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.Scanner;


class StringComm{
	String newString;
	boolean isNewsString = false;
	
	private final ReentrantLock entLock = new ReentrantLock();
	private final Condition readCond = entLock.newCondition();
	private final Condition writeCond = entLock.newCondition();
	
	public void setNewString(String news){
		entLock.lock();
		try{
			if(this.isNewsString == true)
				writeCond.await();
			this.newString = news;
			this.isNewsString = true;
			readCond.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			entLock.unlock();
		}
	}
	
	public String getNewString(){
		String retStr = null;
		entLock.lock();
		try{
			if(this.isNewsString == false)
				readCond.await();
			retStr = this.newString;
			this.isNewsString = false;
			writeCond.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			entLock.unlock();
		}
		return retStr;
	}
}


class StringReader extends Thread{
	StringComm comm;
	StringReader(StringComm comm){
		this.comm = comm;
	}
	public void run(){
		Scanner sc = new Scanner(System.in);
		String readStr;
		
		for(int i=0;i<5;i++){
			readStr = sc.nextLine();
			comm.setNewString(readStr);
		}
		sc.close();
	}
}

class StringWriter extends Thread{
	StringComm comm;
	StringWriter(StringComm comm){
		this.comm = comm;
	}
	public void run(){
		for(int i=0;i<5;i++)
			System.out.println(comm.getNewString());
	}
}

public class ConditionSyncStringReadWrite {

	public static void main(String[] args) {
		StringComm strComm = new StringComm();
		StringReader sr = new StringReader(strComm);
		StringWriter sw = new StringWriter(strComm);
		sr.start();
		sw.start();
		
	}

}
