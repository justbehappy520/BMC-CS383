import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class TestDateParser {
    private final DateParser dateParser = new DateParser();

    // test valid dates
    @Test
    public void testValidDates() {
        assertNotNull(dateParser.parseDate("2025-01-01")); // valid date
        assertNotNull(dateParser.parseDate("2024-02-29")); // leap year
        assertNotNull(dateParser.parseDate("1000-01-01")); // first day
        assertNotNull(dateParser.parseDate("2023-12-31")); // last day
        assertNotNull(dateParser.parseDate("0000-02-28")); // first year
        assertNotNull(dateParser.parseDate("9999-12-31")); // last year
    }

    // test invalid formats
    @Test
    public void testInvalidFormat() {
        assertNull(dateParser.parseDate("2025/01/01")); // invalid separator
        assertNull(dateParser.parseDate("01-01-2023")); // wrong order
        assertNull(dateParser.parseDate("20230101")); // missing dashes
        assertNull(dateParser.parseDate("1-1-1")); // single digits year and month and day
        assertNull(dateParser.parseDate("2025-1-1")); // single digits month and day
        assertNull(dateParser.parseDate("2025-0101")); // missing one dash
        assertNull(dateParser.parseDate("202501-01")); // missing one dash
        assertNull(dateParser.parseDate("2025-01-1")); // 1 digit day
        assertNull(dateParser.parseDate("2025-1-01")); // 1 digit month
        assertNull(dateParser.parseDate("100-01-01")); // 3 digit year
        assertNull(dateParser.parseDate("2025-01-010")); // 3 digit day
        assertNull(dateParser.parseDate("2025-010-01")); // 3 digit month
    }

    // test invalid month
    @Test
    public void testInvalidMonth() {
        assertNull(dateParser.parseDate("2025-00-01")); // month = 00
        assertNull(dateParser.parseDate("2025-13-01")); // month = 13
    }

    // test invalid day
    @Test
    public void testInvalidDay() {
        assertNull(dateParser.parseDate("2025-01-32")); // invalid day in January
        assertNull(dateParser.parseDate("2025-02-30")); // invalid day in February
        assertNull(dateParser.parseDate("2025-03-32")); // invalid day in March
        assertNull(dateParser.parseDate("2025-04-31")); // invalid day in April
        assertNull(dateParser.parseDate("2025-05-32")); // invalid day in May
        assertNull(dateParser.parseDate("2025-06-31")); // invalid day in June
        assertNull(dateParser.parseDate("2025-07-32")); // invalid day in July
        assertNull(dateParser.parseDate("2025-08-32")); // invalid day in August
        assertNull(dateParser.parseDate("2025-09-31")); // invalid day in September
        assertNull(dateParser.parseDate("2025-10-32")); // invalid day in October
        assertNull(dateParser.parseDate("2025-11-31")); // invalid day in November
        assertNull(dateParser.parseDate("2025-12-32")); // invalid day in December
        assertNull(dateParser.parseDate("2025-02-29")); // invalid day in a non-leap year
        assertNull(dateParser.parseDate("2025-01-00")); // invalid day
    }

    // test not number input
    @Test
    public void testNotNumericInput() {
        assertNull(dateParser.parseDate("hello world")); // invalid string
        assertNull(dateParser.parseDate("202X-01-01")); // invalid year w/ letters
        assertNull(dateParser.parseDate("x025-01-01")); // invalid year w/ letters
        assertNull(dateParser.parseDate("2025-xx-01")); // invalid month w/ letters
        assertNull(dateParser.parseDate("2025-01-xx")); // invalid day w/ letters
        assertNull(dateParser.parseDate("2222%as-01")); // random characters
        assertNull(dateParser.parseDate("yyyy-mm-dd")); // letters
    }

    // test leap year
    @Test
    public void testLeapYearFebruary29() {
        assertNotNull(dateParser.parseDate("2024-02-29")); // leap year
        assertNotNull(dateParser.parseDate("2000-02-29")); // leap year
        assertNull(dateParser.parseDate("2025-02-29")); // not leap year
        assertNull(dateParser.parseDate("1900-02-29")); // not leap year
    }

    // test null and empty
    @Test
    public void testNullOrEmpty() {
        assertNull(dateParser.parseDate(null)); // null
        assertNull(dateParser.parseDate("")); // empty
        assertNull(dateParser.parseDate(" ")); // white space
    }
}
