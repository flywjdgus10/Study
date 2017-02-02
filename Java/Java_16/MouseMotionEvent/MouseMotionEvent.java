package Java_16.MouseMotionEvent;

import javax.swing.*;
import java.awt.event.*;

class MouseMotionHandler implements MouseMotionListener{
	public void mouseDragged(MouseEvent e){
		System.out.println(e.getX() + " " + e.getY());
	}
	public void mouseMoved(MouseEvent e){
		System.out.println(e.getX() + " " + e.getY());
	}
}
public class MouseMotionEvent {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Motion");
		frm.setBounds(120,120,250,150);
		frm.addMouseMotionListener(new MouseMotionHandler());
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
