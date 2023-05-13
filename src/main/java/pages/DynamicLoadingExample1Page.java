package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page
{
    WebDriver driver;

    private final By startButtonLocator = By.cssSelector("div[id='start'] button");
    private final By loadingBarLocator = By.id("loading");
    private final By loadedTextLocator = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean isStartButtonDisplayed()
    {
        return driver.findElement(startButtonLocator).isDisplayed();
    }

    public void clickStartButton()
    {
        driver.findElement(startButtonLocator).click();

        // EXPLICIT WAIT
        //WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBarLocator)));

        //FLUENT WAIT
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBarLocator)));


    }

    public String getLoadedText()
    {
        return driver.findElement(loadedTextLocator).getText();
    }




}
