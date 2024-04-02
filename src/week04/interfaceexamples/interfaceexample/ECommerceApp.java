package week04.interfaceexamples.interfaceexample;

public class ECommerceApp {
    public static void main(String[] args) {
        PaymentMethod creditPayment = new CreditCardPayment("123456","1234","123");
        PaymentMethod payPalPayment = new PayPalPayment("mail@gmmail.com");

        double totalPrice =100.50;
        creditPayment.processPayment(totalPrice);
        payPalPayment.processPayment(totalPrice);

    }
}
