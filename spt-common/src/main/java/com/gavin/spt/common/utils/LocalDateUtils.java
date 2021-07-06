package com.gavin.spt.common.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

public class LocalDateUtils {
    public static Date asDate(LocalDate localDate, ZoneId zoneId) {
        if (Objects.isNull(localDate)) {
            return null;
        }
        return Date.from(localDate.atStartOfDay().atZone(zoneId).toInstant());
    }

    public static Date asDate(LocalDate localDateTime) {
        return asDate(localDateTime, ZoneId.systemDefault());
    }

    public static LocalDate asLocalDateTime(Date date, ZoneId zoneId) {
        if (Objects.isNull(date)) {
            return null;
        }
        return Instant.ofEpochMilli(date.getTime()).atZone(zoneId).toLocalDate();
    }

    public static LocalDate asLocalDateTime(Date date) {
        return asLocalDateTime(date, ZoneId.systemDefault());
    }
}
