package Java_8.ImplObjectPrintln;

class ClassPrinter{
	public static void print(Object obj){
		System.out.println(obj.toString());
	}
}

class Point{
	private int xPos,yPos;
	
	Point(int x,int y) {
		this.xPos = x;
		this.yPos = y;
	}
	public String toString(){
		String posInfo = this.xPos + " " + this.yPos;
		return posInfo;
	}
}

public class ImplObjectPrintln {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(5, 9);
		
		ClassPrinter.print(p1);
		ClassPrinter.print(p2);
	}

}
