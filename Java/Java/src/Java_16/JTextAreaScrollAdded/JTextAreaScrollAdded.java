package Java_16.JTextAreaScrollAdded;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

class ButtonTextHandler implements ActionListener{
	JTextArea textArea;
	
	ButtonTextHandler(JTextArea area) {
		this.textArea = area;
	}
	public void actionPerformed(ActionEvent e){
		this.textArea.setText("All data errased\n");
		this.textArea.append("Write what you want to say\n");
	}
}

public class JTextAreaScrollAdded {

	public static void main(String[] args) {
		JFrame frm = new JFrame("JTextArea");
		frm.setBounds(120,120,250,270);
		frm.setLayout(new FlowLayout());
		
		JTextArea textArea = new JTextArea(10,20);
		textArea.append("Write what you want to say\n");
		textArea.setCaretPosition(textArea.getText().length());
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		JButton btn = new JButton("Clear");
		btn.addActionListener(new ButtonTextHandler(textArea));
		
		JScrollPane simpleScroll = new JScrollPane(textArea);
		
		frm.add(simpleScroll);
		frm.add(btn);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	}

}
