package View;




public enum ButtonName
{	
	selectBtn("Select"),
	associationBtn("Association"),
	generalizationBtn("Generalization"),
	compositionBtn("Composition"),
	classBtn("Class"),
	usecaseBtn("UseCase");
	
	private String description;
	
	private ButtonName(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}

}
