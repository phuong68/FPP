package Lesson7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class Prog1 extends JFrame {

	JButton btnConvert;
	JTextField txtMile, txtKilometer;
	JTextField txtPound, txtKilogram;
	JTextField txtGallon, txtLiter;
	JTextField txtFahrenheit, txtCentrigrade;
	JLabel lblMile, lblKilometer;
	JLabel lblPound, lblKilogram;
	JLabel lblGallon, lblLiter;
	JLabel lblFahrenheit, lblCentrigrade;

	public static void main(String[] args) {

		Prog1 window = new Prog1("Metric Conversion Assistant");
		window.pack();
		window.setVisible(true);
	}

	public Prog1(String title) {

		this.setTitle(title);
		InitializeLayout();

	}

	private void InitializeLayout() {

		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
		container.setBounds(10, 10, 400, 300);

		JPanel firstPanel = new JPanel();
		firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.Y_AXIS));

		firstPanel.add(new JLabel("Mile"));
		firstPanel.add(new JLabel("Pound"));
		firstPanel.add(new JLabel("Gallon"));
		firstPanel.add(new JLabel("Fahrenheit"));

		JPanel secondPanel = new JPanel();
		secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.Y_AXIS));

		txtMile = new JTextField(20);
		txtMile.setText("12.00");
		secondPanel.add(txtMile);

		txtPound = new JTextField(20);
		txtPound.setText("14.00");
		secondPanel.add(txtPound);

		txtGallon = new JTextField(20);
		txtGallon.setText("58.00");
		secondPanel.add(txtGallon);

		txtFahrenheit = new JTextField(20);
		txtFahrenheit.setText("32.00");
		secondPanel.add(txtFahrenheit);

		JPanel thirdPanel = new JPanel();
		thirdPanel.setLayout(new BoxLayout(thirdPanel, BoxLayout.Y_AXIS));

		thirdPanel.add(new JLabel("Kilometer"));
		thirdPanel.add(new JLabel("Kilogram"));
		thirdPanel.add(new JLabel("Liter"));
		thirdPanel.add(new JLabel("Centrigrade"));

		btnConvert = new JButton("Convert");
		thirdPanel.add(btnConvert);

		btnConvert.addActionListener(evt -> {
			Converse();
		});

		JPanel ForthPanel = new JPanel();
		ForthPanel.setLayout(new BoxLayout(ForthPanel, BoxLayout.Y_AXIS));

		txtKilometer = new JTextField(20);
		ForthPanel.add(txtKilometer);

		txtKilogram = new JTextField(20);
		ForthPanel.add(txtKilogram);

		txtLiter = new JTextField(20);
		ForthPanel.add(txtLiter);

		txtCentrigrade = new JTextField(20);
		ForthPanel.add(txtCentrigrade);

		container.add(firstPanel);
		container.add(secondPanel);
		container.add(thirdPanel);
		container.add(ForthPanel);

	}

	private void Converse() {
		try {
			txtKilometer.setText("" + Double.parseDouble(txtMile.getText()) * 1.61);
			txtKilogram.setText("" + Double.parseDouble(txtPound.getText()) * 0.45);
			txtLiter.setText("" + Double.parseDouble(txtGallon.getText()) * 3.785412);
			txtCentrigrade.setText("" + (Double.parseDouble(txtFahrenheit.getText())-32) * 0.5556);

		} catch (java.lang.NumberFormatException ex) {
			
			JOptionPane.showMessageDialog(this, "Invalid input, pls check your input format","Input Error", JOptionPane.ERROR_MESSAGE, null);

		}
	}

}
