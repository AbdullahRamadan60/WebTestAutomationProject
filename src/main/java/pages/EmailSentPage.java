package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage
{
    WebDriver driver;

    private final By pageContentLocator = By.id("content");

    EmailSentPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getPageContent()
    {
        return driver.findElement(pageContentLocator).getText();
    }

}
