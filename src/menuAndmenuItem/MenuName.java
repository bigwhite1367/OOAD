package menuAndmenuItem;

public enum MenuName
{
	fileMenu("File"),
	editMenu("Edit");
	
	private String description;
	
	private MenuName(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
}
