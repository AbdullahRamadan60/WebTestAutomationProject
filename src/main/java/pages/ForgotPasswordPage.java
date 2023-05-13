package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage
{
    WebDriver driver;
    private final By emailFieldLocator = By.id("email");
    private final By retrieveButtonLocator = By.id("form_submit");

    ForgotPasswordPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void fillEmailField(String email)
    {
        driver.findElement(emailFieldLocator).sendKeys(email);
    }

    public EmailSentPage clickRetrievePasswordButton()
    {
        driver.findElement(retrieveButtonLocator).click();

        return new EmailSentPage(driver);
    }


}
