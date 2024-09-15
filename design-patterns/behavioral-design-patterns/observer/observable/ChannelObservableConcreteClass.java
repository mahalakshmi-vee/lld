package observable;

import java.util.ArrayList;
import java.util.List;

import main.Video;
import observer.ChannelObserverInterface;

public class ChannelObservableConcreteClass implements ChannelObservableInterface {
	List<ChannelObserverInterface> subscribers;

	public ChannelObservableConcreteClass() {
		subscribers = new ArrayList<>();
	}

	@Override
	public void register(ChannelObserverInterface channelObserverInterface) {
		subscribers.add(channelObserverInterface);
	}

	@Override
	public void unRegister(ChannelObserverInterface channelObserverInterface) {
		subscribers.remove(channelObserverInterface);
	}

	@Override
	public void notifySubscribers(Video video) {
		for (ChannelObserverInterface channelObserverInterface : subscribers) {
			channelObserverInterface.update(video);
		}
	}
}
