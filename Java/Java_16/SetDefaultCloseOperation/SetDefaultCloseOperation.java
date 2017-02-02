package Java_16.SetDefaultCloseOperation;

import javax.swing.*;

public class SetDefaultCloseOperation {

	public static void main(String[] args) {
		JFrame frm1 = new JFrame("1");
		JFrame frm2 = new JFrame("2");
		
		frm1.setBounds(120,120,250,150);
		frm2.setBounds(380,120,250,150);
		
		frm1.add(new JButton("btn1"));
		frm2.add(new JButton("btn2"));
		
		frm1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		frm1.setVisible(true);
		frm2.setVisible(true);
	}

}
