package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	  private WebDriver driver;
	 

	    // page elements
	    @FindBy(id = "APjFqb")
	   private WebElement searchBox;

	    // constructor
	 public GooglePage(WebDriver driver) {
	    this.driver = driver;
	   PageFactory.initElements(driver, this);
	 }

	    // page methods
	    public void search(String searchText) {
	        searchBox.sendKeys(searchText);
	        searchBox.submit();
	    }


}
