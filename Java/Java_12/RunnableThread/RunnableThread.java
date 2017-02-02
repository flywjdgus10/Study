package Java_12.RunnableThread;

class Sum{
	int num;
	
	Sum(){
		this.num = 0;
	}
	public void addNum(int n){
		this.num += n;
	}
	public int getNum(){
		return this.num;
	}
}

class AdderThread extends Sum implements Runnable{
	int start,end;
	AdderThread(int s,int e){
		this.start = s;
		this.end = e;
	}
	public void run(){
		for(int i=this.start;i<=end;i++)
			addNum(i);
	}
}

class ShowThread extends Thread{
	int num;
	int start,end;
	ShowThread(int start,int end) {
		this.num = 0;
		this.start = start;
		this.end = end;
	}
	public void run(){
		for(int i=this.start;i<=this.end;i++)
			num += i;
	}
	public int getNum(){
		return this.num;
	}
}

public class RunnableThread {

	public static void main(String[] args) {
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		
		Thread tr1 = new Thread(at1);
		Thread tr2 = new Thread(at2);
		tr1.start();
		tr2.start();
		
		try{
			tr1.join();
			tr2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(at1.getNum() + at2.getNum());
		
		ShowThread st1 = new ShowThread(1, 50);
		ShowThread st2 = new ShowThread(51, 100);
		st1.start();
		st2.start();
		
		
		try{
			st1.join();
			st2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(st1.getNum() + st2.getNum());
	}

}
















