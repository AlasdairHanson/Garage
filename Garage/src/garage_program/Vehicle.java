package garage_program;

public abstract class Vehicle {
	
	protected String type;
	protected String brand;
	protected String colour;
	protected boolean oilChange;
	protected int tyresToChange;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String type, String brand, String colour, boolean oilChange, int tyresToChange) {
		this.type = type;
		this.brand = brand;
		this.colour = colour;
		this.oilChange = oilChange;
		this.tyresToChange = tyresToChange;
	}
	
	public abstract String beep(); 
}
