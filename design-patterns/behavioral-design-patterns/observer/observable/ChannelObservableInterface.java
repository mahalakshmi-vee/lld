package observable;

import main.Video;
import observer.ChannelObserverInterface;

public interface ChannelObservableInterface {
	void register(ChannelObserverInterface channelObserverInterface);

	void unRegister(ChannelObserverInterface channelObserverInterface);

	void notifySubscribers(Video video);
}
