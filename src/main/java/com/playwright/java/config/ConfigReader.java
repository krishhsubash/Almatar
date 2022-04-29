package com.playwright.java.config;

import javax.persistence.Embedded;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@Data
@NoArgsConstructor
public class ConfigReader {
  private String browser;

  @Embedded
  private MscrmAppSettings mscrm;

  @Embedded
  private SfdcAppSettings sfdc;

  @Embedded
  private BulletAppSettings bullet;

  @Embedded
  private SalesloftAppSettings salesloft;

  @Embedded
  private RosterAppSettings roster;
}
