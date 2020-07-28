package Cards;

public class CreditCard extends PaymentCard{

    private double creditLimit;

    public CreditCard(int cardNumber, String expiryDate, int securityNumber, double creditLimit) {
        super(cardNumber, expiryDate, securityNumber);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
