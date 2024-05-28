public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Используем стратегию оплаты кредитной картой
        cart.setPaymentStrategy(new CreditCardPaymentStrategy("1234 5678 9012 3456", "123"));
        cart.pay(100.50);

        // Используем стратегию оплаты через PayPal
        cart.setPaymentStrategy(new PayPalPaymentStrategy("example@example.com", "password"));
        cart.pay(75.25);
    }
}