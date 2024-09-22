package mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

	private List<Colleague> colleagues = new ArrayList<>();

	@Override
	public void addBidder(Colleague bidder) {
		colleagues.add(bidder);
	}

	@Override
	public void placeBird(Colleague bidder, int bidAmount) {
		for (Colleague colleague : colleagues) {
			if (!colleague.getName().equalsIgnoreCase(bidder.getName())) {
				colleague.receiveBidNotification(bidAmount);
			}
		}
	}
}
