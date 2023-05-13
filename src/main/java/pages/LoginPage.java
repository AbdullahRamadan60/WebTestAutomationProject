package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    private WebDriver driver;

    private final By usernameFieldLocator = By.id("username");
    private final By passwordFieldLocator = By.id("password");
    private final By loginButton = By.cssSelector("button.radius");


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setUsername(String username)
    {
        driver.findElement(usernameFieldLocator).sendKeys(username);
    }

    public void setPassword(String password)
    {
        driver.findElement(passwordFieldLocator).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton()
    {
        driver.findElement(loginButton).click();

        return new SecureAreaPage(driver);
    }



}
