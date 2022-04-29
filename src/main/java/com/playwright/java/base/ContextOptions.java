package com.playwright.java.base;

import com.microsoft.playwright.Browser;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ContextOptions {

  private Browser.NewContextOptions browserContextOptions;

  @Autowired
  ContextOptions(Browser.NewContextOptions contextOptions) {
    this.browserContextOptions = contextOptions;
  }

  public final Browser.NewContextOptions setDesktopContext() {
    browserContextOptions.setRecordVideoDir(Paths.get("target/videos/"))
        .setRecordVideoSize(800, 600)
        .setViewportSize(1280, 680)
        .setAcceptDownloads(true)
        .setLocale("En")
        .setJavaScriptEnabled(true);
    return browserContextOptions;
  }
}
