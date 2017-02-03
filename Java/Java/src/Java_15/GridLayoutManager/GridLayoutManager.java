package Java_15.GridLayoutManager;

import java.awt.*;
import javax.swing.*;

public class GridLayoutManager {

	public static void main(String[] args) {
		JFrame frm = new JFrame("GridLayout Test");
		frm.setBounds(120,120,300,200);
		frm.setLayout(new GridLayout(3, 2, 20, 20));
		
		frm.add(new JButton("1"));
		frm.add(new JButton("2"));
		frm.add(new JButton("3"));
		frm.add(new JButton("4"));
		frm.add(new JButton("5"));
		frm.add(new JButton("6"));
		
		frm.setVisible(true);
	}

}
