package buttons;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JToggleButton;

import mode.Mode;

public class ButtonListener implements ItemListener 
{
	private JToggleButton selectedButton = null;

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getStateChange() == ItemEvent.SELECTED)
		{
			selectedButton  = (JToggleButton)e.getSource();
			selectedButton.setBackground(Color.BLACK);
			Mode.btnState = selectedButton;
		}
		else
		{
			((JToggleButton)e.getSource()).setBackground(Color.WHITE);
		}
		
	}
	

}
