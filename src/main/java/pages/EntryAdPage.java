package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage
{
    WebDriver driver;

    private final By modalLocator = By.className("modal");
    private final By modalTitleLocator = By.xpath("//div[@class='modal-title']/h3");
    private final By closeModalLocator = By.xpath("//p[text()='Close']");
    private final By pageHeaderLocator = By.xpath("//h3[text()='Entry Ad']");



    public EntryAdPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean isModalDisplayed()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalLocator));

        return driver.findElement(modalLocator).isDisplayed();
    }

    public String getModalTitle()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalLocator));

        return driver.findElement(modalTitleLocator).getText();
    }

    public void closeModal()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalLocator));

        driver.findElement(closeModalLocator).click();
    }

    public String getPageHeaderText()
    {
        return driver.findElement(pageHeaderLocator).getText();
    }




}
