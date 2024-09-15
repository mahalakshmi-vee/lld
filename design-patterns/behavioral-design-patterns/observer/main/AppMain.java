package main;

import observable.ChannelObservableConcreteClass;
import observable.ChannelObservableInterface;
import observer.ChannelObserverConcreteClass;
import observer.ChannelObserverInterface;

public class AppMain {
	public static void main(String[] args) {
		ChannelObservableInterface channelObservableInterface = new ChannelObservableConcreteClass();

		ChannelObserverInterface subscriber1 = new ChannelObserverConcreteClass("Subscriber1");
		channelObservableInterface.register(subscriber1);

		ChannelObserverInterface subscriber2 = new ChannelObserverConcreteClass("Subscriber2");
		channelObservableInterface.register(subscriber2);

		Video video = new Video("New Video1", "400MB", "");
		System.out.println("Notified subsribers are as follows: ");
		channelObservableInterface.notifySubscribers(video);
	}
}
