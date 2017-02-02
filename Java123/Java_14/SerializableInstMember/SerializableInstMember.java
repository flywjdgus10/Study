package Java_14.SerializableInstMember;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Point implements Serializable{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}
class Circle implements Serializable{
	Point p;
	double rad;
	
	Circle(int x,int y,double r){
		this.p = new Point(x, y);
		this.rad = r;
	}
	public void showCircleInfo(){
		System.out.println(p.x + " " + p.y + " " + this.rad);
	}
}




public class SerializableInstMember {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
		
		out.writeObject(new Circle(1,1,2.4));
		out.writeObject(new Circle(2,2,4.8));
		out.writeObject("String");
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
		Circle c1 = (Circle)in.readObject();
		Circle c2 = (Circle)in.readObject();
		String message = (String)in.readObject();
		in.close();
		
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println(message);

	}

}
