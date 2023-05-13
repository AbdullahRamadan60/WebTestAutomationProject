package forgotPassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests
{
    @Test
    public void testSentEmailOfForgotPassword()
    {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordLink();

        forgotPasswordPage.fillEmailField("tau@test.com");

        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();

        Assert.assertTrue(emailSentPage.getPageContent().contains("Your e-mail's been sent!"));
    }


}
