package Lesson6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Prog2 extends JFrame implements ActionListener{

	JButton[] buttons = new JButton[7];
	
	public static void main(String[] args) {
		Prog2 window = new Prog2("Rainbow Color Frame ");
		window.pack();
		window.setVisible(true);

	}
	
	public Prog2(String tittle) {
		this.setTitle(tittle);
		InitializeLayout();
	
		
	}
	
	private void InitializeLayout() {
		buttons[0] = new JButton("Red");
		buttons[0].setBackground(Color.RED);
		buttons[0].setToolTipText("Red signifies passion, vitality, enthusiasm and security. It is the light with the longest wavelength.");	
		
		buttons[1] = new JButton("Orange");
		buttons[1].setBackground(Color.ORANGE);
		buttons[1].setToolTipText("Orange is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control.");
		
		buttons[2] = new JButton("Yellow");
		buttons[2].setBackground(Color.YELLOW);
		buttons[2].setToolTipText("Yellow represents clarity of thought, wisdom, orderliness and energy.");
		
		buttons[3] = new JButton("Green");
		buttons[3].setBackground(Color.GREEN);
		buttons[3].setToolTipText("Green is the middle color of the rainbow and denotes fertility, growth, balance, health and wealth.");
		
		buttons[4] = new JButton("Blue");
		buttons[4].setBackground(Color.BLUE);
		buttons[4].setToolTipText("Blue– This the fifth color of the rainbow which makes us think of the Unknown. The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity.");
		
		buttons[5] = new JButton("Indigo");
		buttons[5].setBackground(Color.CYAN);
		buttons[5].setToolTipText("Indigo is mystical as it bridges the Gap between Finite and Infinite. Indigo colored gem stones are often used for spiritual attainment, psychic abilities, self awareness and enhancement of Intuition.");
		
		buttons[6] = new JButton("Violet");
		buttons[6] .setBackground(Color.MAGENTA);
		buttons[6].setToolTipText("Violet is considered the highest element of spirituality. It can ignite one’s imagination and be an inspiration to artists.Dark tones of violet are associated with sorrow. Deeper shades of violet or purple denote high spiritual mastery.");

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
		
		for(JButton b: buttons) {
			b.addActionListener(this);
			container.add(b);
			
		}
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().getClass()==JButton.class)
		{
			JButton jb = (JButton) e.getSource();
			JOptionPane.showMessageDialog(this, jb.getToolTipText(),"Color meaning",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
