import Cards.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(1234567890, "10/12/24", 1111, 1500.00);
    }

    @Test
    public void hasCardNumber() {
        assertEquals(1234567890, creditCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate(){
        assertEquals("10/12/24", creditCard.getExpiryDate());
    }

    @Test
    public void hasSecurityNumber() {
        assertEquals(1111, creditCard.getSecurityNumber());
    }

    @Test
    public void hasCreditLimit(){
        assertEquals(1500.00, creditCard.getCreditLimit(), 0.01);
    }

    @Test
    public void canAddCharge(){
        creditCard.charge(10.00);
        assertEquals(1, creditCard.getNumberOfCharges());
    }

    @Test
    public void canGetTransactionCost() {
        assertEquals(2.00, creditCard.getTransactionCost(100.00), 0.01);
    }
}
