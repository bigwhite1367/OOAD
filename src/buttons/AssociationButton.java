package buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import javax.swing.JToggleButton;

import mode.AssociationMode;
import mode.ClassMode;
import mode.Mode;

public class AssociationButton extends Button 
{
	public AssociationButton(String name)
	{
		super(name);
		addItemListener(new ButtonListener());
	}

}
