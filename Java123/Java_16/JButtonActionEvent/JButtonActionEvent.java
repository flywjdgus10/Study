package Java_16.JButtonActionEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ActionEventListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println(e.getActionCommand());
	}
}

public class JButtonActionEvent {

	public static void main(String[] args) {
		JFrame frm = new JFrame("JButton Disable");
		frm.setBounds(120,120,250,150);
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		
		ActionListener actionHandler = new ActionEventListener();
		btn1.addActionListener(actionHandler);
		btn2.addActionListener(actionHandler);
		
		frm.add(btn1);
		frm.add(btn2);
		btn1.setEnabled(false);
		
		frm.setVisible(true);
	}

}

