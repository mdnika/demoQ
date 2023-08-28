package com.ait.demo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewUserTests extends TestBase{

  @Test
  public void createNewUserPositiveTest() {
    //click on login link - //a[contains(.,'Register')] - xpath
    driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
    //enter FirstName - #FirstName - css
    driver.findElement(By.cssSelector("#FirstName")).click();
    driver.findElement(By.cssSelector("#FirstName")).clear();
    driver.findElement(By.cssSelector("#FirstName")).sendKeys("Demo");
    //enter LastName - #LastName - css
    driver.findElement(By.cssSelector("#LastName")).click();
    driver.findElement(By.cssSelector("#LastName")).clear();
    driver.findElement(By.cssSelector("#LastName")).sendKeys("Project");
    //enter Email - #Email - css
    driver.findElement(By.cssSelector("#Email")).click();
    driver.findElement(By.cssSelector("#Email")).clear();
    driver.findElement(By.cssSelector("#Email")).sendKeys("demo@project.com");
    //enter Password - #Password - css
    driver.findElement(By.cssSelector("#Password")).click();
    driver.findElement(By.cssSelector("#Password")).clear();
    driver.findElement(By.cssSelector("#Password")).sendKeys("Demo1234$");
    //enter ConfirmPassword - #ConfirmPassword - css
    driver.findElement(By.cssSelector("#ConfirmPassword")).click();
    driver.findElement(By.cssSelector("#ConfirmPassword")).clear();
    driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("Demo1234$");

    //click on Registration button -  #register-button - css
    driver.findElement(By.cssSelector("#register-button"));
    //assert Sign out button present -  //a[contains(text(),'Log out')] - xpath
    Assert.assertTrue(isElementPresent(By.xpath(" //a[contains(text(),'Log out')]")));
  }
}
