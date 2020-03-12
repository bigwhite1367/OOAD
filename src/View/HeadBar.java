package View;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import factories.MenuFactory;
import menuAndmenuItem.MenuName;

public class HeadBar extends JMenuBar 
{
	private static HeadBar instance = null;
	private List<JMenu> menus;
	private MenuFactory menuFactory;
	private HeadBar()
	{
		menus = new ArrayList<JMenu>();
		menuFactory = new MenuFactory();
		
		for(MenuName menu : MenuName.values())
		{
			menus.add(menuFactory.createMenu(menu.getDescription()));
			
		}
		menus.forEach(menu -> {
									add(menu);
								});
	}
	
	public static HeadBar getInstance()
	{
		if(instance == null)
			return instance = new HeadBar();
		
		return instance;
	}

}
