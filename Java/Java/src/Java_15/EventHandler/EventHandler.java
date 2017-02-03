package Java_15.EventHandler;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventHandler implements MouseListener{
	public void mouseClicked(MouseEvent e){
		JButton button = (JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println(e.getButton());
		System.out.println("mouse clicked");
	}
	public void mouseEntered(MouseEvent e){
		System.out.println("mouse entered");
	}
	public void mouseExited(MouseEvent e){
		System.out.println("mouse exited");
	}
	public void mousePressed(MouseEvent e){
		System.out.println("mouse pressed");
	}
	public void mouseReleased(MouseEvent e){
		System.out.println("mouse released");
	}
}

public class EventHandler {

	public static void main(String[] args) {
		JFrame frm = new JFrame("First Swing");
		frm.setBounds(120,120,400,100);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("My Button");
		MouseListener listener = new MouseEventHandler();
		btn1.addMouseListener(listener);
		
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(listener);
		

		JButton btn3 = new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}

}
