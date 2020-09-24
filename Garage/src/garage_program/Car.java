package garage_program;

public class Car extends Vehicle {
	
	public Car(String type, String brand, String colour, boolean oilChange, int tyresToChange) {
		super(type, brand, colour, oilChange, tyresToChange);
	
	}
	
	public String beep() {
		return "Beep!";
	}
	
}
