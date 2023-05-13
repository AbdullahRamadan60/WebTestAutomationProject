package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage
{
    WebDriver driver;

    private final By triggerJsAlertButtonLocator = By.xpath("//button[text()='Click for JS Alert']");
    private final By triggerConfirmAlertButtonLocator = By.xpath("//button[text()='Click for JS Confirm']");
    private final By triggerPromptAlertButtonLocator = By.xpath("//button[text()='Click for JS Prompt']");
    private final By resultLocator = By.id("result");

    public AlertsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void triggerJsAlert()
    {
        driver.findElement(triggerJsAlertButtonLocator).click();
    }

    public void triggerConfirmAlert()
    {
        driver.findElement(triggerConfirmAlertButtonLocator).click();
    }

    public void triggerPromptAlert()
    {
        driver.findElement(triggerPromptAlertButtonLocator).click();
    }

    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }

    public void cancelAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText()
    {
        return driver.switchTo().alert().getText();
    }

    public void enterPromptText(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResultText()
    {
        return driver.findElement(resultLocator).getText();
    }









}
