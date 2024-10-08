package scenario2;

public class OrderFacade {
	private ProductDAO productDAO;
	private Invoice invoice;
	private Payment payment;
	private SendNotification sendNotification;
	
	// client don't need to worry if anything internally changes.
	// means if order creation part is slightly modified in the future then client
	// don't need to worry because facade only get modified.
	public OrderFacade() {
		productDAO = new ProductDAO();
		invoice = new Invoice();
		payment = new Payment();
		sendNotification = new SendNotification();
	}

	public void createOrder() {
		Product product = productDAO.getProduct(1122);
		payment.makePayment();
		invoice.generateInvoice();
		sendNotification.sendNotification();
		// order creation successful.
	}
}
