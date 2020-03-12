package shapes;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class ClassObj extends BasicObj 
{
	private JLabel name;
	private JLabel bottom;
	
	public ClassObj()
	{
		setBorder(new EmptyBorder(0, 0, 0, 0));
		name = new JLabel("Class",SwingConstants.CENTER);
		bottom = new JLabel();
		for(int direction = 0; direction<port.length; direction++ )
		{
			port[direction] = new PortObj();
		}
		port[NORTH].setBounds(55,0,10,10);
		port[EAST].setBounds(110,55,10,10);
		port[SOUTH].setBounds(55,110,10,10);
		port[WEST].setBounds(0,55,10,10);
		for(PortObj direction: port)
		{
			add(direction);
		}
		
		name.setBounds(10, 10, 100, 30);
		bottom.setBounds(10, 40, 100, 70);
		name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		bottom.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBackground(Color.WHITE);
		
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
		
		add(name);
		add(bottom);
	}
	
	@Override
	public void changeObjectName(String name)
	{
		this.remove(this.name);
		this.name = new JLabel(name,SwingConstants.CENTER);
		this.name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.name.setBounds(10, 10, 100, 30);
		this.add(this.name);
		repaint();
		
	}

	@Override
	public void addConnectedShape(Shape s) {
		// TODO Auto-generated method stub
		
	}

}
