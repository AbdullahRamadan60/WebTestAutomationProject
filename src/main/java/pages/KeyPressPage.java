package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage
{
    WebDriver driver;

    private final By inputFieldLocator = By.id("target");
    private final By resultParagraphLocator  = By.id("result");

    public KeyPressPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterText(String text)
    {
        driver.findElement(inputFieldLocator).sendKeys(text);
    }

    public void enterPI()
    {
        enterText(Keys.chord(Keys.ALT) + Keys.NUMPAD2 + Keys.NUMPAD2 + Keys.NUMPAD7);
    }

    public String getFieldText()
    {
        return driver.findElement(inputFieldLocator).getAttribute("value");
    }

    public String getResult()
    {
        return driver.findElement(resultParagraphLocator).getText();
    }

}
