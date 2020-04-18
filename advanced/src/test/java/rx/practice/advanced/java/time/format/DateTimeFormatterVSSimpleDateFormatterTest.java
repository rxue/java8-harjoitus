package rx.practice.advanced.java.time.format;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class DateTimeFormatterVSSimpleDateFormatterTest {
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final String DATE_TIME_FORMAT = DATE_FORMAT + "'T'HH:mm:ssX";
    /**
     * Logically parse of 2020-04-0b should fail, but it will not in fact
     * @throws ParseException
     */
    @Test
    public void simpleDateFormatWithInvalidDate() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        Date date = format.parse("2020-04-0b");
        assertNotNull(date);
        assertSame(31, date.getDate());
    }
    @Test
    public void DateTimeFormatterWithInvalidDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        assertThrows(DateTimeParseException.class, () -> formatter.parse("2020-04-0b"));
    }

    /**
     * Logically parse of 0020-50-50 should fail, but it will not in fact
     *
     * @throws ParseException
     */
    @Test
    public void simpleDateFormatWithInvalidDate2() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        Date date = format.parse("0020-50-50");
        assertNotNull(date);
        assertSame(21, date.getDate());
    }

    @Test
    public void DateTimeFormatterWithInvalidDate2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        assertThrows(DateTimeParseException.class, () -> formatter.parse("0020-50-50"));
    }

    @Test
    public void simpleDateFormatWithInvalidDateTime() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
        Date date1 = format.parse("2020-02-27T15:50:00+00:xb");
        Date date2 = format.parse("2020-02-27T15:50:00Z");
        assertEquals(date1, date2);
    }
    @Test
    public void SimpleDateFormatterWithInvalidDateTime() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(DATE_TIME_FORMAT);
        Date date1 = format.parse("2020-02-27T15:50:00+00:xb");
        Date date2 = format.parse("2020-02-27T15:50:00Z");
        assertEquals(date1, date2);
    }
    @Test
    public void DateTimeFormatterWithInvalidDateTime() throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        assertThrows(DateTimeParseException.class, () -> formatter.parse("2020-02-27T15:50:00+00:xb"));
    }
    @Test
    public void DateTimeFormatterWithDateTime() throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT + "'T'HH:mm:ssXXX");
        TemporalAccessor temporalAccessor = formatter.parse("2020-02-27T15:50:00+05:00");
    }
}

