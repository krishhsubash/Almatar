package com.playwright.java.base;

import com.microsoft.playwright.BrowserType;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LaunchPersistentContext {

  private final String currentUsersDir = System.getProperty("user.dir");

  private BrowserType.LaunchPersistentContextOptions launchPersistentOptions;

  @Autowired
  LaunchPersistentContext(BrowserType.LaunchPersistentContextOptions launchPersistentOptions){
    this.launchPersistentOptions = launchPersistentOptions;
  }

  public final BrowserType.LaunchPersistentContextOptions setLaunchPersistantOptions() {
    launchPersistentOptions.setDevtools(false)
      .setChromiumSandbox(true)
      .setAcceptDownloads(true)
      .setDownloadsPath(Path.of(currentUsersDir + "/target/DownloadPath/"))
      .setHeadless(false)
      .setTracesDir(Path.of(currentUsersDir + "/target/TraceDir/"))
      .setTimeout(90000.0)
      .setViewportSize(1650, 1020)
      .setRecordVideoDir(Paths.get(currentUsersDir + "/target/videos/"))
      .setRecordVideoSize(800, 600);
    return launchPersistentOptions;
  }
}
