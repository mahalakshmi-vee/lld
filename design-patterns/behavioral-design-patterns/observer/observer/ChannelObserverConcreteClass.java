package observer;

import main.Video;

public class ChannelObserverConcreteClass implements ChannelObserverInterface {
	private String subscriberUsername;

	public ChannelObserverConcreteClass(String subscriberUsername) {
		this.subscriberUsername = subscriberUsername;
	}

	@Override
	public void update(Video video) {
		String message = String.format(
				"Hello %s, a new video has been uploaded!\n" + "Video Name: %s\n" + "Video Size: %s\n" + "CDN Link: %s",
				subscriberUsername, video.getName(), video.getSize(), video.getCdnLink());

		// Print the detailed message
		System.out.println(message);
	}

	public String getSubscriberUsername() {
		return subscriberUsername;
	}
}
