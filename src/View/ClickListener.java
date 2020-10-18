package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClickListener implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		String getuserValue = JPanel1.getUserField().getText();
		String getpassValue = JPanel1.getPasswdField().getText();
		System.out.println("Username: " + JPanel1.getUserField().getText());
		System.out.println("Passwd: " + JPanel1.getPasswdField().getText());
		
	}

}
