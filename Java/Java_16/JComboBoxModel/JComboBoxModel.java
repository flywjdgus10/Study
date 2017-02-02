package Java_16.JComboBoxModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

class MyFriend{
	String name;
	int age;
	
	MyFriend(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name;
	}
	
	public void showFriendInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

class ChoiceHandler implements ItemListener{
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("Selected...");
			((MyFriend)e.getItem()).showFriendInfo();
		}
		else{
			System.out.println("Deselected...");
			((MyFriend)e.getItem()).showFriendInfo();
		}
	}
}

class TextChangedHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().compareTo("comboBoxEdited") == 0)
			System.out.println("ComboBox Edited");
		else
			System.out.println("ComboBox Changed");
	}
}

public class JComboBoxModel {

	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120,120,250,120);
		frm.setLayout(new GridLayout(0, 2));
		
		Vector<MyFriend> friend = new Vector<MyFriend>();
		friend.add(new MyFriend("A", 22));
		friend.add(new MyFriend("B", 23));
		friend.add(new MyFriend("C", 24));
		friend.add(new MyFriend("D", 25));
		
		JLabel label1 = new JLabel(" ComboBox");
		JLabel label2 = new JLabel(" Editable ComboBox");
		JComboBox cmbBox1 = new JComboBox(friend);
		JComboBox cmbBox2 = new JComboBox(friend);
		cmbBox1.setMaximumRowCount(3);
		cmbBox1.addItemListener(new ChoiceHandler());
		cmbBox2.setEditable(true);
		cmbBox2.addItemListener(new ChoiceHandler());
		
		frm.add(label1);
		frm.add(cmbBox1);
		frm.add(label2);
		frm.add(cmbBox2);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
