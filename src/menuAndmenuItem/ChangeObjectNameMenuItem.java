package menuAndmenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import View.Canvas;

public class ChangeObjectNameMenuItem extends JMenuItem 
{
	public ChangeObjectNameMenuItem(String name)
	{
		super(name);
	}
	
	private class changeObjectNameListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Canvas.getInstance().getShapeList().forEach(ele ->{
													if(ele.isSelected())
													{
														String name = (String) JOptionPane.showInputDialog(null, "Change Name");
														if(!name.equals(""))
														{
															ele.changeObjectName(name);
														}
													}
				
												});
		}
		
	}
}
