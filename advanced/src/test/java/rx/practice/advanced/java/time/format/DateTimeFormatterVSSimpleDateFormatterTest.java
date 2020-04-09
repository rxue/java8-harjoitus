package rx.practice.advanced.java.time.format;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateTimeFormatterVSSimpleDateFormatterTest {
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    @Test
    public void DateTimeFormatterWithInvalidDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        assertThrows(DateTimeParseException.class, () -> formatter.parse("2020-04-0x"));
    }

    /**
     * Logically parse of 2020-04-0x should fail, but it will not in fact
     * @throws ParseException
     */
    @Test
    public void simpleDateFormatterWithInvalidDate() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        Date date = format.parse("2020-04-0x");
        assertNotNull(date);
    }
}
