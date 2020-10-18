package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JPanel1 extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private JLabel loginLabel;
	private JLabel passLabel;
	private static JTextField userField;
	private static JTextField passwdField;
	private JButton button;
    
	public JPanel1()
    {
    	
		createTextField();
		createButton();
		createPanel();
		
	}

	private void createTextField() {
		loginLabel = new JLabel("Username: ");
		final int FIELD_WIDTH = 20;
		setUserField(new JTextField(FIELD_WIDTH));
		passLabel = new JLabel("Password: ");
		passwdField = new JTextField(FIELD_WIDTH);
		
	}
	
	private void createButton() {
		button = new JButton("Enter");
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
	}
	
	private void createPanel() {
		JPanel panel = new JPanel();
		panel.add(loginLabel);
		panel.add(getUserField());
		panel.add(passLabel);
		panel.add(passwdField);
		panel.add(button);
		add(panel);
	}

	public void actionPerformed(ActionEvent event) {
		String getValue = getUserField().getText();
		System.out.println(getValue);
		
	}

	/**
	 * @return the userField
	 */
	public static JTextField getUserField() {
		return userField;
	}

	/**
	 * @param userField the userField to set
	 */
	public void setUserField(JTextField userField) {
		this.userField = userField;
	}
	
	/**
	 * @return the userField
	 */
	public static JTextField getPasswdField() {
		return passwdField;
	}

	/**
	 * @param userField the userField to set
	 */
	public void setPasswdField(JTextField userField) {
		this.passwdField = passwdField;
	}
	
	
	
}