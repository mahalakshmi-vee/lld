package templateMethodDesignPattern;

public class PayToMerchantFlow extends PaymentFlow {
	@Override
	public void validateRequest() {

		System.out.println("Validate logic PayToMerchantFlow");
	}

	@Override
	public void calculateFees() {

		System.out.println("0% fees charged");
	}

	@Override
	public void debitAmount() {

		System.out.println("Debit the amount of PayToMerchantFlow");
	}

	@Override
	public void creditAmount() {

		System.out.println("Credit the amount of PayToMerchantFlow");
	}
}
