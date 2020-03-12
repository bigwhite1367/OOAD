package buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import javax.swing.JToggleButton;

import mode.ClassMode;
import mode.GeneralizationMode;
import mode.Mode;

public class GeneralizationButton extends Button 
{
	public GeneralizationButton(String name)
	{
		super(name);
		addItemListener(new ButtonListener());
	}
	


}
