package main;

import common.TravelType;
import factory.PathFinderFactory;
import strategy.PathFinderStrategy;

public class Client {
	private PathFinderStrategy pathFinderStrategy;

	public Client(TravelType travelType) {
		pathFinderStrategy = PathFinderFactory.createPathFinderStrategy(travelType);
	}

	public void findPath(String source, String destination) {
		pathFinderStrategy.findPath(source, destination);
	}
}
