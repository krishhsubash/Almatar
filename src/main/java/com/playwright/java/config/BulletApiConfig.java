package com.playwright.java.config;

import javax.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Embeddable
public class BulletApiConfig {
  private String clientId;
  private String clientSecret;
  private String tenantId;
  private String subscriptionId;
  private String baseUri;
}

