package View;
import java.awt.*;
import javax.swing.*;
public class myJFrame extends JFrame
{
	
	
	
    public myJFrame()
    {
    	super ("Shoe Store App");
        JPanel1 mjp = new JPanel1();
        add(mjp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (800, 480);
        setVisible(true);
        setBackground(Color.green);
    }
}