package factories;

import javax.swing.JToggleButton;

import buttons.AssociationButton;
import buttons.Button;
import buttons.ClassButton;
import buttons.CompositionButton;
import buttons.GeneralizationButton;
import buttons.SelectButton;
import buttons.UseCaseButton;


public class ButtonFactory 
{
	private Button button;
	
	public Button createButton(String name)
	{
		if(name == "Select")
		{
			return button = new SelectButton(name);
		}
		else if(name == "Association")
		{
			return button = new AssociationButton(name);
		}
		else if(name == "Generalization")
		{
			return button = new GeneralizationButton(name);
		}
		else if(name == "Composition")
		{
			return button = new CompositionButton(name);
		}
		else if(name == "Class")
		{
			return button = new ClassButton(name);
		}
		else if(name == "UseCase")
		{
			return button = new UseCaseButton(name);
		}
		else
		{	
			return null;

		}
	}
}
