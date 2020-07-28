import Cards.CreditCard;
import Cards.DebitCard;
import Cards.GiftCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {
    OnlineAccount onlineAccount;
    ReportingSoftware reportingSoftware;

    @Before
    public void before(){
        reportingSoftware = new ReportingSoftware();
        onlineAccount = new OnlineAccount("Sara", reportingSoftware);
    }

    @Test
    public void hasName(){
        assertEquals("Sara", onlineAccount.getName());
    }

    @Test
    public void startsWithNoPaymentMethod() {
        assertEquals(0, onlineAccount.getPaymentMethods().size());
    }

    @Test
    public void canAddPaymentMethod() {
        GiftCard giftCard = new GiftCard("Amazon", 50.00);
        onlineAccount.addPaymentMethod(giftCard);
        assertEquals(1, onlineAccount.getPaymentMethods().size());
    }

    @Test
    public void hasReportingSoftware() {
        assertEquals(reportingSoftware, onlineAccount.getReportingSoftware());
    }

    @Test
    public void canChargeCustomer() {
        CreditCard creditCard = new CreditCard(123, "123", 123, 123.00);
        onlineAccount.addPaymentMethod(creditCard);
        onlineAccount.chargeCustomer(123.00, creditCard);
        assertEquals(0.00, creditCard.getCreditLimit(), 0.01);
        assertEquals(2.46, reportingSoftware.getTransactionCosts().get(0), 0.01);
    }

}
