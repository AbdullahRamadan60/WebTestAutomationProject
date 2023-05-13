package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;


public class BaseTests
{
    private WebDriver driver;

    protected HomePage homePage;

    @BeforeTest
    public void setUp()
    {
        String driverPath = ".\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver" , driverPath);

        driver = new ChromeDriver(getChromeOptions());

        homePage = new HomePage(driver);

        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(393,851));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //implicit wait
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5))  //Wait for the page to load

        gotoHomepage();
    }

    @BeforeMethod
    public void gotoHomepage()
    {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void recordFailure(ITestResult result)
    {
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot) driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);

            try {
                Files.move(screenShot ,
                        new File("C:\\Users\\Abdullah\\IdeaProjects\\TAU-Automation\\src\\main\\resources\\screenShots\\" + result.getName() + ".png"));
            } catch (IOException e) {throw new RuntimeException(e);}
        }

    }


    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

    public WindowManager getWindowManager()
    {
        return new WindowManager(driver);
    }

    public ChromeOptions getChromeOptions()
    {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));  //To disable info bar
        //options.addArguments("disable-infobars");  // to disable info bar (Chrome is being automated ...... )   //this is Tau's (doesn't work)

        //options.addArguments("--headless=new");  // Run Tests in Headless mode (No Browser opened)
        return options;
    }



}
