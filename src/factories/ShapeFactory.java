package factories;

import shapes.AssociationLineObj;
import shapes.ClassObj;
import shapes.CompositionLineObj;
import shapes.GeneralizationLineObj;
import shapes.Shape;
import shapes.UseCaseObj;

public class ShapeFactory 
{
	private Shape shape;
	
	public Shape createShape(String name)
	{
		if(name == "AssociationLineObj")
		{
			return shape = new AssociationLineObj();
		}
		else if(name == "GeneralizationLineObj")
		{
			return shape = new GeneralizationLineObj();
		}
		else if(name == "CompositionLineObj")
		{
			return shape = new CompositionLineObj();
		}
		else if(name == "ClassObj")
		{
			return shape = new ClassObj();
		}
		else if(name == "UseCaseObj")
		{
			return shape = new UseCaseObj();
		}
		else
		{
			return null;
		}
	}
}
