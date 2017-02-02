package Java_16.JButtonMouseEvent;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MouseEventHandler implements MouseListener{
	public void mouseClicked(MouseEvent e){
		System.out.println("mouse Clicked");
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
}

public class JButtonMouseEvent {

	public static void main(String[] args) {
		JFrame frm = new JFrame("JButton Disable");
		frm.setBounds(120,120,250,150);
		frm.setLayout(new FlowLayout());
		
		MouseListener mouseHandler = new MouseEventHandler();
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(mouseHandler);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(mouseHandler);
		
		frm.add(btn1);
		frm.add(btn2);
		
		btn1.setEnabled(false);
		frm.setVisible(true);
		
		
		
		
		
		
		
	}

}
