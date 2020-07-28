import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReportingSoftwareTest {

    private ReportingSoftware reportingSoftware;

    @Before
    public void before(){
        reportingSoftware = new ReportingSoftware();
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, reportingSoftware.getTransactionCosts().size());
    }

    @Test
    public void canAddCost(){
        reportingSoftware.addTransactionCost(100.00);
        assertEquals(1, reportingSoftware.getTransactionCosts().size());
    }
}
