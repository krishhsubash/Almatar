package com.playwright.java.base;

import com.microsoft.playwright.BrowserType;
import java.nio.file.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LaunchOptions {

  private BrowserType.LaunchOptions browserLaunchOptions;

  @Autowired
  LaunchOptions(BrowserType.LaunchOptions launchOptions) {
    this.browserLaunchOptions = launchOptions;
  }

  public final BrowserType.LaunchOptions setLaunchOptions() {
    browserLaunchOptions.setDevtools(false)
        .setChromiumSandbox(true)
        .setDownloadsPath(Path.of(System.getProperty("user.dir") + "/target/DownloadPath/"))
        .setHeadless(false)
        .setTracesDir(Path.of(System.getProperty("user.dir") + "/target/TraceDir/"))
        .setTimeout(90000.0);
    return browserLaunchOptions;
  }
}
