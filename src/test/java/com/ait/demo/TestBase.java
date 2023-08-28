package com.ait.demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
  WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com");
// maximize browser window
    driver.manage().window().maximize();
// set implicit timeout
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  public boolean isHomeComponentPresent() {
    return driver.findElements(By.xpath("//a[contains(text(),'Register')]")).size()>0;
  }

  public boolean isHomeElementPresent(By locator) {
    return driver.findElements(locator).size()>0;

  }

  public boolean isElementPresent(By locator) {
    try {
      driver.findElements(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;

    }
  }


  @AfterMethod(enabled = false)
  public void terDawn() {
    // close driver
    driver.quit();
  }

}
