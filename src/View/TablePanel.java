package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablePanel extends JPanel {
	
	JTable table; 

	public TablePanel() {
		super();
        setBackground(Color.darkGray);
        setLayout(new BorderLayout());
          
        // Initializing the JTable 
        table = new JTable(); 
        table.setFillsViewportHeight(true);
        
        //table.setDefaultRenderer(Object.class, new FootballPlayerCellRenderer());
  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(table);
        // Using the borderlayout makes the ScrollPane fit the size of the TablePanel
        this.add(sp, BorderLayout.CENTER);  	
    }


}