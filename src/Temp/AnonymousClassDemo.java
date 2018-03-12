package Temp;

import javax.swing.*;
import java.awt.event.*;

public class AnonymousClassDemo extends JFrame {

	public AnonymousClassDemo() {
		// Create four buttons
		JButton jbtNew = new JButton("New");
		JButton jbtOpen = new JButton("Open");
		JButton jbtSave = new JButton("Save");
		JButton jbtPrint = new JButton("Print");

		// Create a panel to hold buttons
		JPanel panel = new JPanel();
		panel.add(jbtNew);
		panel.add(jbtOpen);
		panel.add(jbtSave);
		panel.add(jbtPrint);
		add(panel);
		jbtNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Process New");
			}
		});
		jbtSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Process Save");
			}
		});
		jbtPrint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Process Print");
			}
		});
	}

	public static void main(String[] args) {

		JFrame frame = new AnonymousClassDemo();
		frame.setTitle("AnonymousListenerDemo");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}