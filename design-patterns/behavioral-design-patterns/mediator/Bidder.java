package mediator;

public class Bidder implements Colleague {
	private String name;
	private AuctionMediator auctionMediator;

	public Bidder(String name, AuctionMediator auctionMediator) {
		this.name = name;
		this.auctionMediator = auctionMediator;
		auctionMediator.addBidder(this);
	}

	@Override
	public void placeBid(int bidAmount) {
		auctionMediator.placeBird(this, bidAmount);
	}

	@Override
	public void receiveBidNotification(int bidAmount) {
		System.out.println("Bidder " + name + " got the notification that someone placed the bid of " + bidAmount);
	}

	@Override
	public String getName() {
		return this.name;
	}
}
