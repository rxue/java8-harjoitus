## `Temporal`
The date and time representation within the range of OCP can be grouped into 2 categories:
* with reference frame - UTC
  * `Instant`
  * `ZonedDateTime`, where there is a `toInstant()` method to convert this `ZonedDateTime` to `Instant`
* without reference frame - date and time are considered as local and have nothing to do with UTC
  * `LocalDate`
  * `LocaleTime`
  * `LocaleDateTime`

### `ZonedDateTime`
#### [Format of `ZonedDateTime`](https://www.w3.org/TR/NOTE-datetime)
#### About Daylight Savings Time in relation to `ZonedDateTime`

In time zone **US/Eastern**

* on March 13th, there is no **[2:00,3:00)**
* on November 6th, there are twice **[1:00, 2:00)**


