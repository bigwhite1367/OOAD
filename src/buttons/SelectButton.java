package buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import javax.swing.JToggleButton;

import mode.ClassMode;
import mode.Mode;
import mode.SelectMode;

public class SelectButton extends Button 
{
	public SelectButton(String name)
	{
		super(name);
		addItemListener(new ButtonListener());
	}
	
}
