package com.playwright.java.config;

import javax.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Embeddable
public class RosterAppSettings {
  private String rosterUrl;
  private String username;
  private String password;
  private String token;
}
