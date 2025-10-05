import org.junit.Test;
import static org.junit.Assert.*;

public class TestStringToInteger {
    
   /* @Test 
    public void testWeekInAdvance() {
        int basePrice = 150;
        int daysUntilEvent = 7;
        int customerAge = 28;
        boolean isMember = true;

        double price = BuyTicket.calculatePrice(basePrice, daysUntilEvent, customerAge, isMember); 
        double expectedDiscount = basePrice * .24; //.14 discount for 7 days in advance + .10 discount for member

        assertEquals(basePrice - expectedDiscount, price, 0.0);
    }*/

    @Test
    public void testValidNumberLetter() {
	boolean exceptionThrown = false;

	try {
	    StringToInteger.parseInt("e3");
	}
	catch (NumberFormatException e) {
	    exceptionThrown = true;
	}

	assertTrue(exceptionThrown);
    }

    @Test
    public void testValidNumberSign() {
	boolean exceptionThrown = false;

	try {
	    StringToInteger.parseInt("3-3");
	} catch (NumberFormatException e) {
	    exceptionThrown = true;
	}

	assertTrue(exceptionThrown);
    }

    @Test
    public void testNullString() {
	boolean exceptionThrown = false;
        
        try {
	    StringToInteger.parseInt("");
        } catch (NumberFormatException e) {
	    exceptionThrown = true;
        }
        
        assertTrue(exceptionThrown);	
    }

    @Test
    public void testIsNegative() {
	StringToInteger.parseInt("-12");
	StringToInteger.parseInt("-902834");
	assertEquals(-12,StringToInteger.parseInt("-12"));
	assertEquals(-902834,StringToInteger.parseInt("-902834"));
    }

    @Test public void testIsNotNegative() {
        StringToInteger.parseInt("123");
	assertEquals(123, StringToInteger.parseInt("123"));
    }

    @Test public void testNegationSymbol() {
        StringToInteger.parseInt("-");
	assertEquals(-0,StringToInteger.parseInt("-"));
    }

    @Test public void testIsEmpty() {
        boolean exceptionThrown = false;
	
	try {
	    StringToInteger.parseInt(" ");
	} catch (NumberFormatException e) {
	    exceptionThrown = true;
	}

	assertTrue(exceptionThrown);
    }

    @Test public void testZero() {
    	StringToInteger.parseInt("0");
	assertEquals(0,StringToInteger.parseInt("0"));
    }

    @Test public void testException() {
        Exception e = assertThrows(NumberFormatException.class, () -> { StringToInteger.parseInt("123a");});
        assertEquals("Invalid character found: a",e.getMessage());
    }

}

