package pac;

public class Client {
	public static void main(String[] args) {
		Vehicle vehicle = VehicleFactory.getVehicleObject("car");
		printVehicleDetails(vehicle);
	}

	private static void printVehicleDetails(Vehicle vehicle) {
		System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
		System.out.println("Fuel Capacity: " + vehicle.getFuelCapacity());
	}
}
