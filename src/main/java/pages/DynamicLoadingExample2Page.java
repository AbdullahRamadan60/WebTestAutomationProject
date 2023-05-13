package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page
{
    WebDriver driver;

    private final By startButtonLocator = By.cssSelector("div[id='start'] button");
    private final By loadingBarLocator = By.id("loading");

    private final By loadedTextLocator = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickStartButton()
    {
        driver.findElement(startButtonLocator).click();

        // EXPLICIT WAIT
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedTextLocator));
    }

    public String getLoadedText()
    {
        return driver.findElement(loadedTextLocator).getText();
    }
}
