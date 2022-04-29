package com.playwright.java.base;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.spring.ScenarioScope;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Lazy
@ScenarioScope
@Configuration
public class DriverManager {

  private ConcurrentHashMap<String, List<Page>> pageMap = new ConcurrentHashMap<>();
  private ConcurrentHashMap<String, BrowserContext> browserContextMap = new ConcurrentHashMap<>();
  private Page currentPage;
  private Playwright playwright;
  private BrowserType browserType;
  private BrowserContext browserContext;
  private final LaunchOptions launchOptions;
  private final LaunchPersistentContext launchPersistentContext;
  private final ContextOptions contextOptions;

  private final AppConfig appConfig;

  @Autowired
  DriverManager(AppConfig appConfig, LaunchOptions launchOptions, LaunchPersistentContext launchPersistentContext,
      ContextOptions contextOptions) {
    this.appConfig = appConfig;
    this.launchOptions = launchOptions;
    this.launchPersistentContext = launchPersistentContext;
    this.contextOptions = contextOptions;
  }

  public void launchPlaywright() {
    playwright = Playwright.create();
  }

  public void launchBrowserType() {
    if (appConfig.getReader().getBrowser().equalsIgnoreCase(Browser.CHROME.toString())) {
      browserType = playwright.chromium();
    }
    else if (appConfig.getReader().getBrowser().equalsIgnoreCase(Browser.FIREFOX.toString())) {
      browserType = playwright.firefox();
    }
    else if (appConfig.getReader().getBrowser().equalsIgnoreCase(Browser.SAFARI.toString())) {
      browserType = playwright.webkit();
    }
  }

  public void createNewPage(String application) {
    Page page = null;
    List<Page> pages = new ArrayList<>();

    if (application.equalsIgnoreCase(String.valueOf(Application.BULLET))) {
      browserContext = browserType.launchPersistentContext(
          Paths.get(System.getProperty("user.dir") + "/target/mfa/" + Thread.currentThread().getId() + "/"),
          launchPersistentContext.setLaunchPersistantOptions());
      page = browserContext.newPage();
    } else if (application.equalsIgnoreCase(Application.MSCRM.toString()) || application.equalsIgnoreCase(
        Application.SFDC.toString()) || application.equalsIgnoreCase(Application.ROSTER.toString())) {
      browserContext = browserType.launch(launchOptions.setLaunchOptions())
          .newContext(contextOptions.setDesktopContext());
      page = browserContext.newPage();
    }
    else if (application.equalsIgnoreCase(Application.ALMATAR.toString())) {
      browserContext = browserType.launch(launchOptions.setLaunchOptions())
              .newContext(contextOptions.setDesktopContext());
      page = browserContext.newPage();
    }
    browserContextMap.put(application,browserContext);
    switchToBrowserContext(browserContext);
    switchToPage(page);
    pages.add(page);
    pageMap.put(application, pages);
  }

  public void createNewPage(String application, Page page) {
    pageMap.get(application).add(page);
    switchToPage(page);
  }

  public void switchToPage(Page page) {
    currentPage = page;
  }

  public void switchToBrowserContext(BrowserContext browserContext) {
    this.browserContext = browserContext;
  }

  public void switchToPage(String application, String title) {
    currentPage = pageMap.get(application).stream().filter(page -> page.title().contains(title)).findFirst().orElse(null);
  }

  public void switchToPage(String application, int index) {
    currentPage = pageMap.get(application).get(index);
  }

  public void switchToPage(String application) {
    currentPage = pageMap.get(application).get(0);
  }

  public Page getPage() {
    return currentPage;
  }

  public BrowserContext getContext() {
    return browserContext;
  }

  public void close() {
    if (pageMap != null) {
      pageMap.forEach((k, v) -> {
        v.forEach(Page::close);
        pageMap.remove(k);
      });
      }
    if (browserContextMap != null) {
      browserContextMap.forEach((k, v) -> {
        v.close();
        browserContextMap.remove(k);
      });
    }
    playwright.close();
  }

  private enum Browser {
    CHROME("Chrome"),
    FIREFOX("Firefox"),
    SAFARI("Safari");

    final String value;

    Browser(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return this.value;
    }
  }

  private enum Application {
    SFDC("SFDC"),
    MSCRM("MSCRM"),
    ROSTER("Roster"),
    BULLET("Bullet"),
    ALMATAR("Almatar");

    final String value;

    Application(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return this.value;
    }
  }
}