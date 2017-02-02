package Java_16.JFrameWindowEvent;


import javax.swing.*;
import java.awt.event.*;

class WindowEventHandler implements WindowListener{
	String frameInfo;
	
	WindowEventHandler(String info){
		this.frameInfo = info;
	}
	public void windowActivated(WindowEvent e){
		System.out.println(this.frameInfo + " windowActivated");
	}
	public void windowClosed(WindowEvent e){
		System.out.println(this.frameInfo + " windowClosed");
	}
	public void windowClosing(WindowEvent e){
		JFrame frm = (JFrame)e.getWindow();
		frm.dispose();
		System.out.println(this.frameInfo + " windowClosing");
	}
	public void windowDeactivated(WindowEvent e){
		System.out.println(this.frameInfo + " windowDeactivated");
	}
	public void windowDeiconified(WindowEvent e){
		System.out.println(this.frameInfo + " windowDeiconified");
	}
	public void windowIconified(WindowEvent e){
		System.out.println(this.frameInfo + " windowIconified");
	}
	public void windowOpened(WindowEvent e){
		System.out.println(this.frameInfo + " windowOpened");
	}
}

public class JFrameWindowEvent {

	public static void main(String[] args) {
		JFrame frmOne = new JFrame("Frame One");
		JFrame frmTwo = new JFrame("Frame Two");
		
		frmOne.setBounds(120,120,250,150);
		frmTwo.setBounds(380,120,250,150);
		
		frmOne.addWindowListener(new WindowEventHandler("Frame One"));
		frmTwo.addWindowListener(new WindowEventHandler("Frame Two"));
		
		frmOne.add(new JButton("Btn 1"));
		frmTwo.add(new JButton("Btn 2"));
		
		frmOne.setVisible(true);
		frmTwo.setVisible(true);
	}

}
