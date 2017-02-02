package Java_9.InstanceCloning;

class Point implements Cloneable{
	private int xPos;
	private int yPos;
	
	public Point(int x,int y){
		this.xPos = x;
		this.yPos = y;
	}
	
	public void showPosition(){
		System.out.println(this.xPos + " " + this.yPos);
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class InstanceCloning {

	public static void main(String[] args) {
		Point org = new Point(3, 5);
		Point cpy;
		
		try{
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}

	}

}
