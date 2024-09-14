package strategy;

public class FlightPathFinderStrategy implements PathFinderStrategy{
	@Override
	public void findPath(String source, String destination) {
		System.out.println("Flight path finding is running");
	} 
}
