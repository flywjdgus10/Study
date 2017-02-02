package Java_9.EncapsulationEquals;


class Point{
	int xPos,yPos;
	
	Point(int x,int y){
		this.xPos = x;
		this.yPos = y;		
	}
	
	public void showPosition(){
		System.out.printf("[%d, %d]",this.xPos,this.yPos );
	}


	public boolean equals(Object obj){
		if((this.xPos == ((Point)obj).xPos) &&
				(this.yPos == ((Point)obj).yPos))
			return true;
		else
			return false;
	}
}

class Rectangle{
	Point upperLeft,lowerRight;
	Rectangle(int x1,int y1,int x2,int y2) {
		this.upperLeft = new Point(x1, y1);
		this.lowerRight = new Point(x2, y2);
	} 
	
	public void showPosition(){
		this.upperLeft.showPosition();
		this.lowerRight.showPosition();
	}

	public boolean equals(Object obj){
		if(this.upperLeft.equals(((Rectangle)obj).upperLeft) &&
				this.lowerRight.equals(((Rectangle)obj).lowerRight)) 
			return true;
		else
			return false;
	}
}

public class EncapsulationEquals {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1, 1, 3, 3);
		Rectangle r2 = new Rectangle(1, 1, 3, 3);
		if(r1 == r2)
			System.out.println("1");
		else
			System.out.println("2");
		
		if(r1.equals(r2))
			System.out.println("1");
		else
			System.out.println("2");
	}

}
