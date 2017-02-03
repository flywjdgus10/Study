package Java_3.CalculatorMain;
import Java_3.orange.cal.*;
public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("1 + 2 = " + cal.addTwoNumber(1, 2));
		System.out.println("5 - 1 = " + cal.subTwoNumber(5, 1));

	}

}
