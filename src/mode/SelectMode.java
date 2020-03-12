package mode;

import java.awt.event.MouseEvent;

import View.Canvas;

public class SelectMode extends Mode 
{
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		if(Mode.btnState.getText() == "Select")
		{
			Canvas.getInstance().getShapeList().forEach(ele->{ ele.deSelected();});
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
