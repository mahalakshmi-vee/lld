package main;

import common.TravelType;

public class AppMain {
	public static void main(String[] args) {
		Client maha = new Client(TravelType.FLIGHT);
		maha.findPath("Chennai", "Bangalore");

		Client mahima = new Client(TravelType.TRAIN);
		mahima.findPath("Chennai", "Delhi");
	}
}
