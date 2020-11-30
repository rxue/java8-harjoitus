package rx.practice.advanced.learningtests.java.time.format;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;

public class DateTimeFormatterConstantsTest {
    @Test
    public void testISO_LOCAL_DATE() {
        DateTimeFormatter isoLocalDate = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(isoLocalDate.toFormat().toString());
        DateTimeFormatter isoDate = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(isoDate.toString());
    }
}
