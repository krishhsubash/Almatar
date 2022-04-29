package com.playwright.java.config;

import javax.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Embeddable
public class SalesloftAppSettings {
  private String saleslofturl;
  private String username;
}
