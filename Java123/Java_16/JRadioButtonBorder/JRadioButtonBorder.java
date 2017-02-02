package Java_16.JRadioButtonBorder;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;


class CheckBoxHandler implements ItemListener{
	JRadioButton btn1;
	JRadioButton btn2;
	JRadioButton btn3;
	
	CheckBoxHandler(JRadioButton b1,JRadioButton b2,JRadioButton b3) {
		this.btn1 = b1;
		this.btn2 = b2;
		this.btn3 = b3;
	}
	
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){
			this.btn1.setEnabled(true);
			this.btn2.setEnabled(true);
			this.btn3.setEnabled(true);
		}
		else{
			this.btn1.setEnabled(false);
			this.btn2.setEnabled(false);
			this.btn3.setEnabled(false);			
		}
			
	}
}

public class JRadioButtonBorder {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Border");
		frm.setBounds(120,120,200,200);
		frm.setLayout(new GridLayout(0, 1));
		
		JCheckBox checkBox = new JCheckBox("Are you a programmer?");
		
		JRadioButton rbtn1 = new JRadioButton("I like C");
		JRadioButton rbtn2 = new JRadioButton("I like C++");
		JRadioButton rbtn3 = new JRadioButton("I like JAVA",true);
		rbtn1.setEnabled(false);
		rbtn2.setEnabled(false);
		rbtn3.setEnabled(false);		
		rbtn1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					System.out.println("I like C too");
			}
		});
		rbtn2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					System.out.println("I like C++ too");
			}
		});
		rbtn3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					System.out.println("I like JAVA too");
			}
		});
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(rbtn1);
		bGroup.add(rbtn2);
		bGroup.add(rbtn3);
		
		Border rbtnBorder = BorderFactory.createEtchedBorder();
		rbtnBorder = BorderFactory.createTitledBorder(rbtnBorder,"Language");
		
		JPanel rbtnBorderPanel = new JPanel();
		rbtnBorderPanel.setLayout(new GridLayout(0, 1));
		rbtnBorderPanel.setBorder(rbtnBorder);
		rbtnBorderPanel.add(rbtn1);
		rbtnBorderPanel.add(rbtn2);
		rbtnBorderPanel.add(rbtn3);
		
		
		
		
		checkBox.addItemListener(new CheckBoxHandler(rbtn1, rbtn2, rbtn3));
		frm.add(checkBox);
		frm.add(rbtnBorderPanel);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	
	
	}

}
