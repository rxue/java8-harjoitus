# Don't Use Legacy `java.util.Date`

> Date is obsolete and should no longer be used in new code<sup>Effective Java > Chapter 8 Methods > Item 50: Make defensive copied when needed</sup>

In addition to note above, the avoidance of using the legacy`SimpleDateFormat` bears noting as well. In the [DateTimeFormatterVSSimpleDateFormatterTest](https://github.com/rxue/java8-harjoitus/blob/master/advanced/src/test/java/rx/practice/advanced/java/time/format/DateTimeFormatterVSSimpleDateFormatterTest.java), with format `yyyy-MM-dd`, the date value `2020-04-0x` can not be parsed with `DateTimeFormatter` due to `DateTimeParseException` but it will be parsed successfully by `SimpleDateFormat` illogically.
