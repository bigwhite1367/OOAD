package buttons;

import java.awt.Color;
import java.awt.event.ItemEvent;

import javax.swing.JToggleButton;

import mode.Mode;

public class CompositionButton extends Button 
{
	public CompositionButton(String name)
	{
		super(name);
		addItemListener(new ButtonListener());
	}
	

}
