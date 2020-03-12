package View;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import factories.ListenerFactory;
import mode.Mode;
import shapes.Shape;

public class Canvas extends JPanel 
{
	private static Canvas instance = null;
	private ListenerFactory listenerFactory;
	private List<Shape> shapeList;
	private Canvas()
	{
		setLayout(null);
		setBackground(Color.WHITE);
		shapeList = new ArrayList<Shape>();
		listenerFactory = new ListenerFactory();

		for(ButtonName btn: ButtonName.values())
		{
			addMouseListener(listenerFactory.createListener(btn.getDescription()));
			addMouseMotionListener(listenerFactory.createListener(btn.getDescription()));
		}
	}
	
	public static Canvas getInstance()
	{
		if(instance == null)
		{
			return instance = new Canvas();
		}
		
		return instance;
		
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
	}
	
	public void addShape(Shape s)
	{
		add(s);
	}
	
	public List<Shape> getShapeList()
	{
		return shapeList;
	}
}
