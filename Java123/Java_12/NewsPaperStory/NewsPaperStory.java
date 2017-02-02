package Java_12.NewsPaperStory;

class NewsPaper{
	String todayNews;
	boolean isTodayNews = false;
	public void setToday(String news){
		this.todayNews = news;
		this.isTodayNews = true;
		
		synchronized (this) {
			notifyAll();
		}
	}
	public String getTodayNews(){
		if(this.isTodayNews == false){
			try{
				synchronized (this) {
					wait();
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		return this.todayNews;
	}
}

class NewsWriter extends Thread{
	NewsPaper paper;
	NewsWriter(NewsPaper paper){
		this.paper = paper;
	}
	public void run(){
		paper.setToday("Hot");
	}
}
class NewsReader extends Thread{
	NewsPaper paper;
	NewsReader(NewsPaper paper){
		this.paper = paper;
	}
	public void run(){
		System.out.println(paper.getTodayNews());
	}
}

public class NewsPaperStory {

	public static void main(String[] args) {
		NewsPaper paper = new NewsPaper();
		NewsReader reader1 = new NewsReader(paper);
		NewsReader reader2 = new NewsReader(paper);
		NewsWriter writer = new NewsWriter(paper);
		
		
		try{
			reader1.start();
			reader2.start();
			Thread.sleep(1000);
			writer.start();
			
			reader1.join();
			reader2.join();
			writer.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
