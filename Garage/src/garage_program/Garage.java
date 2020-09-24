package garage_program;
import java.util.ArrayList;

public class Garage extends Vehicle {
	protected double oilChangePrice = 15.99;
	protected double motorcycleTyrePrice = 40.00;
	protected double carTyrePrice = 20.00;
	private double total = 0;
	
	public Garage() {
		super();
	}
	
	public Garage(ArrayList<Vehicle> vehicles) {
		
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.type + " | " + vehicle.brand + " | " + vehicle.colour + " | " + vehicle.oilChange + " | " + vehicle.tyresToChange);
			if (vehicle.type == "Car") {
				if (vehicle.oilChange == true) {
					total += oilChangePrice;
				}
			    if (vehicle.tyresToChange > 0) {
					total += carTyrePrice * vehicle.tyresToChange;
				}
			}
			else if (vehicle.type == "Motorbike") {
				if (vehicle.oilChange == true) {
					total += oilChangePrice;
				}
				if (vehicle.tyresToChange > 0) {
					total += carTyrePrice * vehicle.tyresToChange;
				}
			}	
			System.out.println("This service will cost: £" + total);
		}
	}
	
	public String beep() {
		return "Beep!";
	}

}
