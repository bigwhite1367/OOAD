package factories;

import javax.swing.JMenuItem;

import menuAndmenuItem.ChangeObjectNameMenuItem;
import menuAndmenuItem.GroupMenuItem;
import menuAndmenuItem.UngroupMenuItem;

public class EditMenuFactory 
{
	private JMenuItem menuItem;
	
	public JMenuItem createMenuItem(String name)
	{
		if(name == "Group")
		{
			return menuItem = new GroupMenuItem(name);
		}
		else if(name == "Ungroup")
		{
			return menuItem = new UngroupMenuItem(name);
		}
		else if(name == "Change Object Name")
		{
			return menuItem = new ChangeObjectNameMenuItem(name);
		}
		else
		{
			return null;
		}
	}
}
