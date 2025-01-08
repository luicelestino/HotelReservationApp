package com.example.demo.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneHandler {
     public static String handleTimeZones() {
          StringBuilder timeZones = new StringBuilder();

          ZoneId zMST = ZoneId.of("America/Denver");
          ZoneId zEST = ZoneId.of("America/New_York");
          ZoneId zUTC = ZoneId.of("UTC");

          LocalDateTime localDateTime = LocalDateTime.now();
          DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm");

          System.out.println("Local time: " + localDateTime.format(dateTimeFormatter));

          ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());

          ZonedDateTime zonedDateTimeMST = zonedDateTime.withZoneSameInstant(zMST);
          LocalDateTime localDateTimeMST = zonedDateTimeMST.toLocalDateTime();

          System.out.println("MST: " + localDateTimeMST.format(dateTimeFormatter));
          timeZones.append("\nMST: ").append(localDateTimeMST.format(dateTimeFormatter));
          timeZones.append(", ");

          ZonedDateTime zonedDateTimeEST = zonedDateTime.withZoneSameInstant(zEST);
          LocalDateTime localDateTimeEST = zonedDateTimeEST.toLocalDateTime();

          System.out.println("EST: " + localDateTimeEST.format(dateTimeFormatter));
          timeZones.append("\nEST: ").append(localDateTimeEST.format(dateTimeFormatter));
          timeZones.append(", ");

          ZonedDateTime zonedDateTimeUTC = zonedDateTime.withZoneSameInstant(zUTC);
          LocalDateTime localDateTimeUTC = zonedDateTimeEST.toLocalDateTime();

          System.out.println("UTC: " + localDateTimeUTC.format(dateTimeFormatter));
          timeZones.append("\nUTC: ").append(localDateTimeUTC.format(dateTimeFormatter));

          return timeZones.toString();
     }
}
