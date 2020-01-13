package decorator;

public abstract class Beverage {
	protected String description = "Empty";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract int cost();
}
