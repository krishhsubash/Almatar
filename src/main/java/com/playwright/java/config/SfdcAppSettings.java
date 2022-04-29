package com.playwright.java.config;

import javax.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Embeddable
public class SfdcAppSettings {
  private String username;
  private String password;
  private String sfdcClientId;
  private String sfdcClientSecret;
  private String sfdcUrl;
}
