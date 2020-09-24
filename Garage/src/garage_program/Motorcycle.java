package garage_program;

public class Motorcycle extends Vehicle {
	
	public Motorcycle(String type, String brand, String colour, boolean oilChange, int tyresToChange) {
		super(type, brand, colour, oilChange, tyresToChange);
	}
	
	public String beep() {
		return "Beep!";
	}
}
