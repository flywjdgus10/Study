package Java_2.orange;
public class PackageCircle {

	public static void main(String[] args) {
		Java_2.orange.area.Circle c1 = new Java_2.orange.area.Circle(1.5);
		Java_2.orange.perimeter.Circle c2 = new Java_2.orange.perimeter.Circle(2.5);
		System.out.println(c1.getArea());
		System.out.println(c2.getPerimeter());	
		
		
		

	}

}
