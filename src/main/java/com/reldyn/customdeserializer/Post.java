package com.reldyn.customdeserializer;

import java.time.LocalDate;

public record Post(String id, String title, String slug, LocalDate date, Integer timeToRead, String tags) {
}
