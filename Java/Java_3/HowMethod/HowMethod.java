package Java_3.HowMethod;

class SimpleMath{
	public static final double PI = 3.1415;
	public double add(double n1,double n2){
		return n1+n2;
	}
	public double min(double n1,double n2){
		return n1-n2;
	}
	public double mul(double n1,double n2){
		return n1*n2;
	}
}

class AreaMath{
	public double calCircleArea(double rad){
		SimpleMath sm = new SimpleMath();
		double result = sm.mul(rad, rad);
		result = sm.mul(result, SimpleMath.PI);
		return result;
	}
	
	public double calRectangleArea(double width,double height){
		SimpleMath sm = new SimpleMath();
		double result = sm.mul(width, height);
		return result;
	}
}

class PerimeterMath{
	public double calCirclePeri(double rad){
		SimpleMath sm = new SimpleMath();
		double result = sm.mul(rad, 2);
		result = sm.min(result, SimpleMath.PI);
		return result;
	}
	public double calRectanglePeri(double width,double height){
		SimpleMath sm = new SimpleMath();
		return sm.add(sm.add(width, 2),sm.add(height, 2));
	}
}



public class HowMethod {

	public static void main(String[] args) {
		AreaMath am = new AreaMath();
		PerimeterMath pm = new PerimeterMath();
		
		System.out.println(am.calCircleArea(2.4));
		System.out.println(pm.calRectanglePeri(2.0, 4.0));
	}

}
