package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests
{
    @Test
    public void testFileUpload()
    {
        FileUploadPage fileUploadPage = homePage.clickFileUploadLink();

        fileUploadPage.uploadFile("C:\\Users\\Abdullah\\IdeaProjects\\TAU-Automation\\src\\main\\resources\\chromedriver.exe");
        fileUploadPage.clickUploadButton();

        Assert.assertEquals(fileUploadPage.getUploadedFilesNames() , "chromedriver.exe");
    }
}
