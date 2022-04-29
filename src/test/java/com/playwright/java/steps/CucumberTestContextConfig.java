package com.playwright.java.steps;

import com.playwright.java.PlaywrightJavaApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;


@CucumberContextConfiguration
@SpringBootTest(classes = PlaywrightJavaApplication.class)
public class CucumberTestContextConfig {
}
