package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.GooglePage;

public class GoogleTest {
   private WebDriver driver;
   private GooglePage googlePage;

   @BeforeMethod
   public void setup() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      googlePage = new GooglePage(driver);
   }

   @Test
   public void searchTest() {
      googlePage.search("Selenium Java");
      Assert.assertTrue(driver.getTitle().contains("Selenium Java"));
   }

   @AfterMethod
   public void teardown() {
      driver.quit();
   }
}



