package factories;

import mode.AssociationMode;
import mode.ClassMode;
import mode.CompositionMode;
import mode.GeneralizationMode;
import mode.Mode;
import mode.SelectMode;
import mode.UseCaseMode;

public class ListenerFactory 
{
	private Mode listener;
	public Mode  createListener(String name)
	{
		if(name == "Select")
		{
			return listener = new SelectMode();
		}
		if(name == "Association")
		{
			return listener = new AssociationMode();
		}
		if(name == "Generalization")
		{
			return listener = new GeneralizationMode();
		}
		if(name == "Composition")
		{
			return listener = new CompositionMode();
		}
		if(name == "Class")
		{
			return listener = new ClassMode();
		}
		if(name == "UseCase")
		{
			return listener = new UseCaseMode();
		}
		else
		{	
			return null;

		}
	}
}
