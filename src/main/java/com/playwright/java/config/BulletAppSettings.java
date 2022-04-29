package com.playwright.java.config;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Embeddable
public class BulletAppSettings {
  private String bulletUrl;
  private String username;
  private String password;

  @Embedded
  private BulletApiConfig apiConfig;
}
