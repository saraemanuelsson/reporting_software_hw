package Cards;

public class DebitCard extends PaymentCard{
    private int sortCode;
    private int accountNumber;

    public DebitCard(int cardNumber, String expiryDate, int securityNumber, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public int getSortCode() {
        return sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0.01 * purchaseAmount;
    }
}
