package Java_9.DeepCopy;


class Point implements Cloneable{
	private int xPos;
	private int yPos;
	
	Point(int x,int y){
		this.xPos = x;
		this.yPos = y;
	}
	
	public void showPosition(){
		System.out.println(this.xPos + " " + this.yPos);
	}
	
	public void changePos(int x,int y){
		this.xPos = x;
		this.yPos = y;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}


class Rectangle implements Cloneable{
	Point upperLeft,lowerRight;
	
	Rectangle(int x1,int y1,int x2,int y2) {
		this.upperLeft = new Point(x1, y1);
		this.lowerRight = new Point(x2, y2);
	}
	
	public void showPosition(){
		this.upperLeft.showPosition();
		this.lowerRight.showPosition();
	}
	public void changePos(int x1,int y1,int x2,int y2){
		this.upperLeft.changePos(x1, y1);
		this.lowerRight.changePos(x2, y2);
	}
	public Object clone() throws CloneNotSupportedException{
		Rectangle copy = (Rectangle)super.clone();
		copy.lowerRight = (Point)this.lowerRight.clone();
		copy.upperLeft = (Point)this.upperLeft.clone();
		return copy;
	}
}



public class DeepCopy {

	public static void main(String[] args) {
		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;
		try{
			cpy = (Rectangle)org.clone();
			org.changePos(2, 2, 7, 7);
			org.showPosition();
			cpy.showPosition();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}

	}

}
