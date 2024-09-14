package factory;

import common.TravelType;
import strategy.CarPathFinderStrategy;
import strategy.FlightPathFinderStrategy;
import strategy.PathFinderStrategy;
import strategy.TrainPathFinderStrategy;
import strategy.WalkPathFinderStrategy;

public class PathFinderFactory {
	public static PathFinderStrategy createPathFinderStrategy(TravelType travelType) {
		switch (travelType) {
		case WALK: {
			return new WalkPathFinderStrategy();
		}
		case TRAIN: {
			return new TrainPathFinderStrategy();
		}
		case CAR: {
			return new CarPathFinderStrategy();
		}
		case FLIGHT: {
			return new FlightPathFinderStrategy();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + travelType);
		}
	}
}
