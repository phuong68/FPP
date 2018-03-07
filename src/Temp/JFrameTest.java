package Temp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JFrameTest extends JFrame {

	public static void main(String[] args) {

		JFrameTest window = new JFrameTest();
		window.setVisible(true);

	}
	
	public JFrameTest() {
		this.setTitle("Login");
		//this.setLayout(null);
		this.setBounds(100, 100, 400, 200);
		
		JLabel lblUsername = new JLabel();
		lblUsername.setLocation(150,150);
		JTextField txtUsername = new JTextField();
		JLabel lblPwd = new JLabel();
		JPasswordField txtPwd = new JPasswordField();
		txtPwd.setEchoChar('*');

		JButton btnLogin = new JButton("Login");
		JButton btnReg = new JButton("Register");
		
		this.add(lblUsername);//,10,10);
		this.add(txtUsername);//,20,10);
		this.add(lblPwd);//,10,20);
		this.add(txtPwd);//,20,20);
		
		this.add(btnLogin);//,10,30);
		this.add(btnReg);//,30,30);
		
		
		
	}

}
