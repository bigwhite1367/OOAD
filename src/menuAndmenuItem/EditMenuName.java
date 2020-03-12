package menuAndmenuItem;

public enum EditMenuName
{
	groupEditMenuItem("Group"),
	ungroupEditMenuItem("Ungroup"),
	changeObjectNameEditMenuItem("Change Object Name");
	
	private String description;
	
	private EditMenuName(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
}
