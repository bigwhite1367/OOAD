package menuAndmenuItem;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import factories.EditMenuFactory;

public class EditMenu extends JMenu 
{	
	private EditMenuFactory editMenuFactory;
	private List<JMenuItem> items;
	public EditMenu(String name)
	{
		super(name);
		items = new ArrayList<JMenuItem>();
		editMenuFactory = new EditMenuFactory();
		
		for(EditMenuName item : EditMenuName.values())
		{
			items.add(editMenuFactory.createMenuItem(item.getDescription()));
			
		}
		items.forEach(item -> {
									add(item);
								});
	}
}
