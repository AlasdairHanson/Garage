package garage_program;
import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		
		ArrayList<Vehicle> garage = new ArrayList<>();
		
		Car car1 = new Car("Car", "Ford", "Red", true, 2);
		Car car2 = new Car("Car", "Audi", "Black", true, 1);
		Motorcycle bike1 = new Motorcycle("Motorbike", "Yamaha", "Black", true, 1);
		Motorcycle bike2 = new Motorcycle("Motorbike", "BMW", "Silver", false, 2);
	
		garage.add(car1);
		garage.add(car2);
		garage.add(bike1);
		garage.add(bike2);
		
		Garage myGarage = new Garage(garage);
	}
}
