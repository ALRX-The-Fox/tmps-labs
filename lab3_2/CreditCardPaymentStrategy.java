public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using credit card.");
    }
}