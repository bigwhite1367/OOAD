package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class UseCaseObj extends BasicObj
{
	
		private JLabel name;
		private Graphics2D g2d;
		
		public UseCaseObj()
		{
			setBorder(new EmptyBorder(0, 0, 0, 0));
			for(int direction = 0; direction<port.length; direction++ )
			{
				port[direction] = new PortObj();
			}
			port[NORTH].setBounds(55,0,10,10);
			port[EAST].setBounds(110,35,10,10);
			port[SOUTH].setBounds(55,70,10,10);
			port[WEST].setBounds(0,35,10,10);
			for(PortObj direction: port)
			{
				add(direction);
			}
			name = new JLabel("UseCase",SwingConstants.CENTER);
			name.setBounds(10, 25, 100, 30);
			setBackground(Color.WHITE);
			
			addMouseListener(new MouseHandler());
			addMouseMotionListener(new MouseMotionHandler());
			add(name);
			repaint();
	}
		
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g2d = (Graphics2D) g;
			g2d.draw(new Ellipse2D.Double(10, 10, 100, 60));
		}

		

	@Override
	public void changeObjectName(String name) 
	{
		this.remove(this.name);
		this.name = new JLabel(name,SwingConstants.CENTER);
		this.name.setBounds(10, 25, 100, 30);
		this.add(this.name);
		repaint();
		
	}

	@Override
	public void addConnectedShape(Shape s) {
		// TODO Auto-generated method stub
		
	}

}
