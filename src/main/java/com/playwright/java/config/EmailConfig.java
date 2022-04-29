package com.playwright.java.config;

import javax.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Embeddable
public class EmailConfig {

  private String smtpServer;
  private int smtpPort;
  private String smtpUsername;
  private String smtpPassword;
  private String popServer;
  private String popUsername;
  private int popPort;
  private String popPassword;
}

