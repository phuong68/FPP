package Lesson6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prog1 extends JFrame implements ActionListener {
	JButton btnCount , btnReverse, btnRemove;
	JTextField txtInput, txtOutput;
	
	
	public static void main(String[] a) {
		Prog1 stringWindow = new Prog1("String Utility");
		stringWindow.pack();
		stringWindow.setVisible(true);
	}
	
	public Prog1(String sTittle) {
		
		this.setTitle(sTittle);
		InititallizeLayout();
		
	}
	
	private void InititallizeLayout(){
		btnCount = new JButton("Count Letters");
		btnCount.addActionListener(this);
		
		btnReverse = new JButton("Reverse Letters");
		btnReverse.addActionListener(this);
		
		btnRemove = new JButton("Remove Duplicates");
		btnRemove.addActionListener(this);
		
		txtInput = new JTextField(20);
		txtOutput = new JTextField(20);
		
		Container container = this.getContentPane();
		container.setLayout(new BorderLayout());
		container.setBounds(0, 0, 500, 200);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		
		leftPanel.add(btnCount);
		leftPanel.add(btnReverse);
		leftPanel.add(btnRemove);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
								
		rightPanel.add(new JLabel("Input"));
		rightPanel.add(txtInput);
		rightPanel.add(new JLabel("Output"));
		rightPanel.add(txtOutput);
		
		container.add(leftPanel,"West");
		container.add(rightPanel,"East");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(btnCount)) {
			
			this.txtOutput.setText(""+this.txtInput.getText().length());
			
		}
		
		if (e.getSource().equals(btnReverse)) {
			
			//output = input.Revserse;
			this.txtOutput.setText(""+ Reverse(this.txtInput.getText()));
			
		}
		
		if (e.getSource().equals(btnRemove)) {
			//output = input.removedepulicate;
			this.txtOutput.setText(""+RemoveDuplicate(this.txtInput.getText()));
			
			
		}
	
	
	}
	
	
	public String Reverse(String str) {
	
		String ret="";
		int len = str.length();
		if (len==0) {
			return "";
		}else if (len==1){
			return str;
		}else {
			ret = Reverse(str.substring(1)) + str.charAt(0);
		}
		
		return ret;
	}
	
	// Still wrong for aabbddcchgsa
	public String RemoveDuplicate(String str) {
	
		
		
		if ( str.length() <= 1 ) return str;
	    if( str.substring(1,2).equals(str.substring(0,1)) ) return RemoveDuplicate(str.substring(1));
	    else return str.substring(0,1) + RemoveDuplicate(str.substring(1));
		
	}
		
	
	
	

}
