package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class PortObj extends Shape
{
	private List<Shape> lineObj;
	public PortObj()
	{
		super();
		setVisible(true);
		setBackground(Color.WHITE);
		lineObj = new ArrayList<Shape>();
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}

	@Override
	public void changeObjectName(String name)
	{
		//do nothing
		
	}

	@Override
	public void addConnectedShape(Shape s)
	{
		lineObj.add(s);
		
	}

	@Override
	public void beSelected() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deSelected() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
