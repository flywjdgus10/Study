package Java_12.ThreadHeapAccess;

class Sum{
	int num;
	Sum(){
		this.num = 0;
	}
	public void addNum(int n){
		this.num += n;
	}
	public int getNum(){
		return num;
	}
}

class AdderThread extends Thread{
	Sum sumInst;
	int start,end;
	
	AdderThread(Sum su,int s,int e) {
		this.sumInst = su;
		this.start = s;
		this.end = e;
	}
	public void run(){
		for(int i=this.start;i<=this.end;i++)
			sumInst.addNum(i);
	}
}

public class ThreadHeapAccess {

	public static void main(String[] args) {
		Sum s = new Sum();
		AdderThread at1 = new AdderThread(s, 1, 50);
		AdderThread at2 = new AdderThread(s, 51, 100);
		at1.start();
		at2.start();
		
		try{
			at1.join();
			at2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(s.getNum());
	}

}
