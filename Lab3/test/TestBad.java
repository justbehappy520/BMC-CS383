import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestBad {

    @Test 
    public void testWeekInAdvance() {
        int basePrice = 150;
        int daysUntilEvent = 7;
        int customerAge = 28;
        boolean isMember = true;

        double price = BuyTicketTransformed.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .24; //.14 discount for 7 days in advance + .10 discount for member
    }

    @Test 
    public void testDayOf() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 31;
        boolean isMember = true;
        
        double price = BuyTicketTransformed.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .10; //.10 discount for membership
    }


    @Test 
    public void testIsSenior() {
        boolean b = BuyTicketTransformed.isSenior(65);
    }

    @Test 
    public void testIsMinor() {
        boolean b = BuyTicketTransformed.isMinor(18);
    }
}
