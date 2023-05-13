package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage
{
    WebDriver driver;

    private final By fileUploadLocator = By.id("file-upload");
    private final By uploadButtonLocator = By.id("file-submit");
    private final By uploadedFilesLocator = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void uploadFile(String absolutPathOfFile)
    {
        driver.findElement(fileUploadLocator).sendKeys(absolutPathOfFile);
    }

    public void clickUploadButton()
    {
        driver.findElement(uploadButtonLocator).click();
    }

    public String getUploadedFilesNames()
    {
        return driver.findElement(uploadedFilesLocator).getText();
    }

}
