package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests
{
    @Test
    public void testSuccessfulLogin()
    {
        LoginPage loginPage = homePage.clickLoginLink();

        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");

        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String flashMsgTxt = secureAreaPage.getFlashMessage();

        Assert.assertTrue(flashMsgTxt.contains("You logged into a secure area!") );

    }

}
