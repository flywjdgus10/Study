package Java_12.SummerThreadTest;
import java.util.Scanner;
class IntegerComm{
	int num=0;
	boolean isNewNum = false;
	
	public void setNum(int n){
		synchronized (this) {
			if(this.isNewNum == true){
				try{
					wait();					
				}catch(InterruptedException e){
					e.printStackTrace();
				}				
			}		
			this.num = n;
			this.isNewNum = true;
			notify();
		}
	}
	
	public int getNum(){
		int retNum=0;
		synchronized (this) {
			if(this.isNewNum == false){
				try{
					wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			retNum = this.num;
			this.isNewNum = false;
			notify();
		}
		return retNum;
	}
}

class IntegerSummer extends Thread{
	IntegerComm comm = new IntegerComm();
	int sum=0;
	IntegerSummer(IntegerComm comm){
		this.comm = comm;
	}
	public void run(){
		for(int i=0;i<5;i++)
			sum += comm.getNum();
		System.out.println(sum);
	}
}

public class SummerThreadTest {

	public static void main(String[] args) {
		IntegerComm comm = new IntegerComm();
		IntegerSummer summer = new IntegerSummer(comm);
		summer.start();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
			comm.setNum(sc.nextInt());
		
		try{
			summer.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		sc.close();
	}

}
