package shapes;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;

import View.Canvas;
import mode.Mode;



public abstract class BasicObj extends Shape
{

	protected final int NORTH = 0;
	protected final int EAST = 1;
	protected final int SOUTH = 2;
	protected final int WEST = 3;
	protected PortObj port[] = new PortObj[4];
	
	public BasicObj()
	{
		super();
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	@Override
	public void beSelected()
	{
		for(PortObj ele: port)
		{
			ele.setBackground(Color.BLACK);
		}
	}
	
	@Override
	public boolean isSelected()
	{
		if(port[0].getBackground() == Color.BLACK)
			return true;
		
		return false;
	}
	
	@Override
	public void deSelected()
	{
		for(int direction=0; direction<port.length; direction++)
		{
				port[direction].setBackground(Color.WHITE);
		}
	}
	protected class MouseHandler extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			if(Mode.btnState.getText() == "Select")
			{
				Canvas.getInstance().getShapeList().forEach(ele ->{
					
																		ele.deSelected();
																	});
				beSelected();
			}
		}
		@Override
		public void mousePressed(MouseEvent e)
		{
			
			
		}
	}
	

	protected class MouseMotionHandler extends MouseMotionAdapter
	{
		@Override
		public void mouseDragged(MouseEvent e)
		{
			
		}
	}
}
