import Cards.GiftCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    private GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard("Amazon", 100.00);
    }

    @Test
    public void hasVendor() {
        assertEquals("Amazon", giftCard.getVendor());
    }

    @Test
    public void hasBalance() {
        assertEquals(100.00, giftCard.getBalance(), 0.01);
    }

    @Test
    public void canCharge() {
        giftCard.charge(20.00);
        assertEquals(80.00, giftCard.getBalance(), 0.01);
    }

    @Test
    public void dontHaveTransactionCharge() {
        assertEquals(0.00, giftCard.getTransactionCost(100.00), 0.01);
    }

}
