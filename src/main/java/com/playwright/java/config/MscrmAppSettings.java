package com.playwright.java.config;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Embeddable
public class MscrmAppSettings {

  private String environmentInstance;
  private String onlineCrmUrl;
  private String clientId;
  private String clientSecret;
  private boolean captureScreenshotOnSuccess;
  private String salesRepUsername;
  private String salesRepPassword;
  private String salesRepMfaSecretKey;
  private String supportRepUsername;
  private String supportRepPassword;
  private String supportRepMfaSecretKey;

  @Embedded
  private EmailConfig emailConfiguration;
}
