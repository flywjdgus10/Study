package Java_1.TriangleInstanceTest;


class Triangle{
	
	double bottom;
	double height;
	public Triangle(double bt,double hg){
		this.bottom = bt;
		this.height = hg;
	}
	
	
	public void setBottom(double bt){
		this.bottom = bt;
	}

	public void setHeight(double hg){
		this.height = hg;
	}
	public double getArea(){
		return this.bottom*this.height/2;
	}
}
public class TriangleInstanceTest {

	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2, 17.3);
		System.out.println(tr.getArea());
		tr.setBottom(7.5);
		tr.setHeight(9.2);
		System.out.println(tr.getArea());

	}

}
