package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorPage
{
    WebDriver driver;

    private final String editorFrameID = "mce_0_ifr";
    private final By textAreaLocator = By.id("tinymce");
    private final By increaseIndentLocator = By.cssSelector("button[title='Increase indent']");

    public EditorPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clearTextArea()
    {
        switchToEditArea();
        driver.findElement(textAreaLocator).click();
        driver.findElement(textAreaLocator).clear();
        switchToMainArea();
    }

    public void TypeInTextArea(String text)
    {
        switchToEditArea();
        driver.findElement(textAreaLocator).sendKeys(text);
        switchToMainArea();
    }

    public void clickIncreaseIndentButton()
    {
        driver.findElement(increaseIndentLocator).click();
    }

    public String getTextFromEditor()
    {
        switchToEditArea();
        String editorText = driver.findElement(textAreaLocator).getText();
        switchToMainArea();

        return editorText;
    }

    private void switchToEditArea()
    {
        driver.switchTo().frame(editorFrameID);
    }

    private void switchToMainArea()
    {
        driver.switchTo().parentFrame();
    }




}
