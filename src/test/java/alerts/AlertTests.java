package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AlertsPage;

public class AlertTests extends BaseTests
{

    @Test
    public void testAcceptanceOfTheAlert()
    {
        AlertsPage alertsPage = homePage.clickAlertsLink();

        alertsPage.triggerJsAlert();
        alertsPage.acceptAlert();

        Assert.assertEquals(alertsPage.getResultText() , "You successfully clicked an alert");
    }

    @Test
    public void testGettingTextFromTheAlert()
    {
        AlertsPage alertsPage = homePage.clickAlertsLink();
        alertsPage.triggerConfirmAlert();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(alertsPage.getAlertText() , "I am a JS Confirm");

        alertsPage.cancelAlert();

        softAssert.assertEquals(alertsPage.getResultText() , "You clicked: Cancel");

        softAssert.assertAll();
    }

    @Test
    public void testEnterTextInPromptAlert()
    {
        AlertsPage alertsPage = homePage.clickAlertsLink();
        alertsPage.triggerPromptAlert();
        alertsPage.enterPromptText("Hello World!!");
        alertsPage.acceptAlert();

        Assert.assertEquals(alertsPage.getResultText() , "You entered: Hello World!!");
    }




}
