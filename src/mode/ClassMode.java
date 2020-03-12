package mode;

import java.awt.event.MouseEvent;

import View.Canvas;
import factories.ShapeFactory;
import shapes.Shape;

public class ClassMode extends Mode
{	
	private ShapeFactory shapeFactory = new ShapeFactory();
	@Override
	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if(Mode.btnState.getText() == "Class")
		{
			Shape s= shapeFactory.createShape("ClassObj");
			s.setBounds(e.getX(), e.getY(), 120, 120);
			Canvas.getInstance().addShape(s);
			Canvas.getInstance().repaint();
		}
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}
}
