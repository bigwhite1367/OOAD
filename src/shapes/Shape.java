package shapes;

import javax.swing.JPanel;

public  abstract class Shape extends JPanel 
{
	public abstract void changeObjectName(String name);
	public abstract void beSelected();
	public abstract void deSelected();
	public abstract boolean isSelected();
	public abstract void addConnectedShape(Shape s);
}
