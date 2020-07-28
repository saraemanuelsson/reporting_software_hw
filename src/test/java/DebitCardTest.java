import Cards.DebitCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard(1234567890, "10/12/24", 1111, 123456, 987654321);
    }

    @Test
    public void hasCardNumber() {
        assertEquals(1234567890, debitCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate(){
        assertEquals("10/12/24", debitCard.getExpiryDate());
    }

    @Test
    public void hasSecurityNumber() {
        assertEquals(1111, debitCard.getSecurityNumber());
    }

    @Test
    public void hasSortCode(){
        assertEquals(123456, debitCard.getSortCode());
    }

    @Test
    public void hasAccountNumber(){
        assertEquals(987654321, debitCard.getAccountNumber());
    }
    @Test
    public void canAddCharge(){
        debitCard.charge(10.00);
        assertEquals(1, debitCard.getNumberOfCharges());
    }

    @Test
    public void canGetTransactionCost() {
        assertEquals(1.00, debitCard.getTransactionCost(100.00), 0.01);
    }
}
