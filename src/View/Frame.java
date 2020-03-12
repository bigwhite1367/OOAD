package View;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JPanel;



public class Frame extends JFrame
{
	public Frame(String frameName)
	{
		super(frameName);
		
		add(ButtonPanel.getInstance(),BorderLayout.WEST);
		add(HeadBar.getInstance(), BorderLayout.NORTH);
		add(Canvas.getInstance(), BorderLayout.CENTER);
	}
}
