package com.gavin.spt.common.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class LocalDateTimeUtils {
    final public static DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * 字符串转LocalDateTime
     *
     * @param dateTime
     * @return
     */
    public static LocalDateTime string2LocalDateTime(String dateTime) {
        return LocalDateTime.parse(dateTime, DATETIME_FORMATTER);
    }

    public static Date asDate(LocalDateTime localDateTime, ZoneId zoneId) {
        if (Objects.isNull(localDateTime)) {
            return null;
        }
        return Date.from(localDateTime.atZone(zoneId).toInstant());
    }

    public static Date asDate(LocalDateTime localDateTime) {
        return asDate(localDateTime, ZoneId.systemDefault());
    }

    public static LocalDateTime asLocalDateTime(Date date, ZoneId zoneId) {
        if (Objects.isNull(date)) {
            return null;
        }
        return Instant.ofEpochMilli(date.getTime()).atZone(zoneId).toLocalDateTime();
    }

    public static LocalDateTime asLocalDateTime(Date date) {
        return asLocalDateTime(date, ZoneId.systemDefault());
    }
}
