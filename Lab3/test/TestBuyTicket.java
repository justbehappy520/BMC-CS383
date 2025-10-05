import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestBuyTicket {

    @Test 
    public void testWeekInAdvance() {
        int basePrice = 150;
        int daysUntilEvent = 7;
        int customerAge = 28;
        boolean isMember = true;

        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .24; //.14 discount for 7 days in advance + .10 discount for member

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }

    @Test 
    public void testDayOf() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 31;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .10; //.10 discount for membership

        assertEquals(basePrice - expectedDiscount, price, 0.0); 
    }

    @Test
    public void testIsSenior() {
        assertTrue(BuyTicket.isSenior(66)); // 66 is a senior
        assertTrue(BuyTicket.isSenior(10000));  // Edge case: really old
        assertFalse(BuyTicket.isSenior(65)); // 18 is not a senior
        assertFalse(BuyTicket.isSenior(64)); // 19 is not a senior
    }

    @Test
    public void testSenior() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 70;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .20; //.20 discount for membership and seniority

        assertEquals(basePrice - expectedDiscount, price, 0.0); 
    }

    @Test
    public void testSixtyFour() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 64;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .10; //.10 discount for membership

        assertEquals(basePrice - expectedDiscount, price, 0.0); 
    }
    
    @Test
    public void testSixtyFive() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 65;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .10; //.10 discount for membership

        assertEquals(basePrice - expectedDiscount, price, 0.0); 
    }

    @Test
    public void testSixtySix() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 66;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .12; //.10 discount for membership, 0.02 discount for seniority

        assertEquals(basePrice - expectedDiscount, price, 0.0); 
    }

    @Test
    public void testIsMinor() {
        assertTrue(BuyTicket.isMinor(17)); // 17 is a minor
        assertTrue(BuyTicket.isMinor(0));  // Edge case: baby
        assertFalse(BuyTicket.isMinor(18)); // 18 is not a minor
        assertFalse(BuyTicket.isMinor(19)); // 19 is not a minor
    }

    @Test
    public void testMinor() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 13;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .20; //.20 discount for membership and minor

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }

    @Test
    public void testTwenty() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 20;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .10; //.10 discount for membership

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }
    
    @Test
    public void testNineteen() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 19;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .10; //.10 discount for membership

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }

    @Test
    public void testEighteen() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 18;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .10; //.10 discount for membership

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }

    @Test
    public void testSeventeen() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 17;
        boolean isMember = true;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .12; //.10 discount for membership, .02 discount for minor

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }

    @Test
    public void testEightDays() {
        int basePrice = 150;
        int daysUntilEvent = 8;
        int customerAge = 28;
        boolean isMember = true;

        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember);
        double expectedDiscount = basePrice * 0.26; // .16 discount for 8 days, .10 discount for membership
        
        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }
    
    @Test
    public void testWeekInAdvanceNotMember() {
        int basePrice = 150;
        int daysUntilEvent = 7;
        int customerAge = 28;
        boolean isMember = false;

        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember);
        double expectedDiscount = basePrice * 0.14; // .14 discount for 7 days in advance

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }

    @Test 
    public void testDayOfNotMember() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 31;
        boolean isMember = false;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .0; //no discount

        assertEquals(basePrice - expectedDiscount, price, 0.0); 
    }

    @Test
    public void testSeniorNotMember() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 70;
        boolean isMember = false;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .10; //.10 discount for seniority

        assertEquals(basePrice - expectedDiscount, price, 0.0); 
    }

    @Test
    public void testEighteenNotMember() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 18;
        boolean isMember = false;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .0; // no discount

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }

    @Test
    public void testMinorNotMember() {
        int basePrice = 150;
        int daysUntilEvent = 0;
        int customerAge = 13;
        boolean isMember = false;
        
        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .10; //.10 discount for minor

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }
}
