package factories;

import javax.swing.JMenu;

import menuAndmenuItem.EditMenu;

public class MenuFactory 
{
	private JMenu menu;
	
	public JMenu createMenu(String name)
	{
		if(name == "File")
		{
			return menu = new JMenu(name);
		}
		else if(name == "Edit")
		{
			return menu = new EditMenu(name);
		}
		else
		{
			return null;
		}
	}
	
}
