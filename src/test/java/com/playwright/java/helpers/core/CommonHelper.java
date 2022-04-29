package com.playwright.java.helpers.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;


@Component
public class CommonHelper {
  public String currentDate(String format) {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
    LocalDateTime date = LocalDateTime.now();
    return dateTimeFormatter.format(date);
  }
}
