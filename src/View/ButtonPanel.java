package View;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import buttons.Button;
import factories.ButtonFactory;


public class ButtonPanel extends JPanel
{
	private static ButtonPanel instance = null;
	private List<Button> buttons;
	private ButtonGroup btnGroup;
	private ButtonFactory btnFactory;
	private ButtonPanel()
	{

		buttons = new ArrayList<Button>();
		btnGroup = new ButtonGroup();
		btnFactory = new ButtonFactory();
		for(ButtonName btn : ButtonName.values())
		{
			buttons.add(btnFactory.createButton(btn.getDescription()));
			
		}
		buttons.forEach(btn -> {
									btnGroup.add(btn);
									add(btn);
									btn.setOpaque(true);
								});
		setLayout(new GridLayout(buttons.size(),1));
	}
	
	public static ButtonPanel getInstance()
	{
		if(instance == null)
		{
			return instance = new ButtonPanel();
		}
		
		return instance;
	}
}
