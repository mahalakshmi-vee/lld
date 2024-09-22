package mediator;

public interface AuctionMediator {
	void addBidder(Colleague bidder);

	void placeBird(Colleague bidder, int bidAmount);
}
