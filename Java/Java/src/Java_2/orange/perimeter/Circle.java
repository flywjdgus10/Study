package Java_2.orange.perimeter;

public class Circle {
	double rad;
	final double PI;
	public Circle(double r){
		this.rad = r;
		PI = 3.14;
	}
	public double getPerimeter(){
		return (rad*2)*PI;
	}
}
