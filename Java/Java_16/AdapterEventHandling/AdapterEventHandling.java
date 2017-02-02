package Java_16.AdapterEventHandling;

import javax.swing.*;
import java.awt.event.*;

class MouseEventHandler extends MouseAdapter{
	public void mouseClicked(MouseEvent e){
		System.out.println("clicked");
	}
}

public class AdapterEventHandling {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Motion");
		frm.setBounds(120,120,250,150);
		frm.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				System.out.println("CLICKED");
			}
		});
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
