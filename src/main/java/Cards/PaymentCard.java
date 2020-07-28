package Cards;

import java.util.ArrayList;

public abstract class PaymentCard {

    private int cardNumber;
    private String expiryDate;
    private int securityNumber;
    private ArrayList<Double> charges;

    public PaymentCard(int cardNumber, String expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.charges = new ArrayList<Double>();
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public ArrayList<Double> getCharges() {
        return this.charges;
    }

    public void addCharges(double charge) {
        this.charges.add(charge);
    }

    public int getNumberOfCharges() {
        return this.charges.size();
    }
}

