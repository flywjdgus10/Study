package Java_15.MultiLayoutManager;

import java.awt.*;
import javax.swing.*;

public class MultiLayoutManager {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Multi Layout Manager");
		frm.setBounds(120,120,250,150);
		frm.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("B1");
		JButton btn2 = new JButton("B2");
		JButton btn3 = new JButton("B3");
		JButton btn4 = new JButton("B4");
		JButton btn5 = new JButton("B5");
		JButton btn6 = new JButton("B6");
		JButton btn7 = new JButton("B7");
		JButton btn8 = new JButton("B8");
		JButton btn9 = new JButton("B9");
		JButton btn10 = new JButton("B10");
		
		JPanel panel1 = new JPanel();
		panel1.add(btn1);
		panel1.add(btn2);
		panel1.add(btn3);
		panel1.add(btn4);
		
		JPanel panel2 = new JPanel();
		panel2.add(btn5);
		panel2.add(btn6);
		panel2.add(btn7);
		panel2.add(btn8);
		panel2.add(btn9);
		panel2.add(btn10);
		
		frm.add(panel1,BorderLayout.NORTH);
		frm.add(panel2,BorderLayout.CENTER);
		
		frm.setVisible(true);
	}

}
