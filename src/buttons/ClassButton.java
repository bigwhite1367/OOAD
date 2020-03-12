package buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import javax.swing.JToggleButton;

import mode.ClassMode;
import mode.Mode;

public class ClassButton extends Button 
{
	public ClassButton(String name)
	{
		super(name);
		addItemListener(new ButtonListener());
	}
	

}
