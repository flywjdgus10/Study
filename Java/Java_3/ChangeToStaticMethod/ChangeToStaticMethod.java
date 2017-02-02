package Java_3.ChangeToStaticMethod;

class SimpleMath{
	public static final double PI = 3.1415;
	public static double add(double n1,double n2){
		return n1+n2;
	}
	public static double min(double n1,double n2){
		return n1-n2;
	}
	public static double mul(double n1,double n2){
		return n1*n2;
	}
}

class AreaMath{
	public static double calCircleArea(double rad){
		double result = SimpleMath.mul(rad, rad);
		result = SimpleMath.mul(result, SimpleMath.PI);
		return result;
	}
	
	public static double calRectangleArea(double width,double height){
		double result = SimpleMath.mul(width, height);
		return result;
	}
}

class PerimeterMath{
	public static double calCirclePeri(double rad){
		double result = SimpleMath.mul(rad, 2);
		result = SimpleMath.min(result, SimpleMath.PI);
		return result;
	}
	public static double calRectanglePeri(double width,double height){
		return SimpleMath.add(SimpleMath.add(width, 2),SimpleMath.add(height, 2));
	}
}



public class ChangeToStaticMethod {

	public static void main(String[] args) {
		System.out.println(AreaMath.calCircleArea(2.4));
		System.out.println(PerimeterMath.calRectanglePeri(2, 4));

	}

}
