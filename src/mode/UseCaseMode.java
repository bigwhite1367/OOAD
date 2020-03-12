package mode;

import java.awt.event.MouseEvent;

import View.Canvas;
import factories.ShapeFactory;
import shapes.Shape;

public class UseCaseMode extends Mode 
{
	private ShapeFactory shapeFactory = new ShapeFactory();
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		if(Mode.btnState.getText() == "UseCase")
		{
			Shape s= shapeFactory.createShape("UseCaseObj");
			s.setBounds(e.getX(), e.getY(), 120, 80);
			Canvas.getInstance().addShape(s);
			Canvas.getInstance().repaint();
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
