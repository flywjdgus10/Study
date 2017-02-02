package Java_15.FlowLayoutManager;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutManager {

	public static void main(String[] args) {
		JFrame frm = new JFrame("FlowLayout Test");
		frm.setBounds(120,120,400,200);
		frm.setLayout(new FlowLayout());
		
		frm.add(new Button("Hi1"));
		frm.add(new Button("Hi2"));
		frm.add(new Button("Hi3"));
		
		frm.add(new LargeButton("Hi1"));
		frm.add(new LargeButton("Hi2"));
		frm.add(new LargeButton("Hi3"));
		
		frm.setVisible(true);
	}

}

class LargeButton extends JButton{
	LargeButton(String str){
		super(str);
	}
	public Dimension getPreferredSize(){
		Dimension largeBtmSz = new Dimension(
					super.getPreferredSize().width+30,
					super.getPreferredSize().height+15
				);
		return largeBtmSz;
	}
	
}