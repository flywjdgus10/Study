package Java_3.RingTest;

class Point{
	private int xPos,yPos;
	
	Point(int x,int y){
		this.xPos = x;
		this.yPos = y;
	}
	public void showPointInfo(){
		System.out.println(xPos + " " + yPos);
	}
}

class Circle{
	private Point node;
	private int rad;
	
	Circle(int x,int y,int r){
		this.rad = r;
		this.node = new Point(x,y);
	}
	public void showCircleInfo(){
		node.showPointInfo();
		System.out.println(rad);
	}
}

class Ring{
	private Circle c1;
	private Circle c2;
	Ring(int x1,int y1,int r1,int x2,int y2,int r2){
		this.c1 = new Circle(x1,y1,r1);
		this.c2 = new Circle(x2,y2,r2);
	}
	public void showRingInfo(){
		c1.showCircleInfo();
		c2.showCircleInfo();
	}
}
public class RingTest {

	public static void main(String[] args) {
		Ring ring = new Ring(1, 1, 4, 2, 2, 9);
		ring.showRingInfo();
	}

}
