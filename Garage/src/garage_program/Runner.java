package garage_program;
import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		
		ArrayList<Vehicle> garage = new ArrayList<>();
			
		garage.add(new Car("Car", "Ford", "Red", true, 2));
		//garage.add(new Motorcycle("Yamaha", "Black", true, 1));
		
		Garage myGarage = new Garage(garage);
				
	}
}
