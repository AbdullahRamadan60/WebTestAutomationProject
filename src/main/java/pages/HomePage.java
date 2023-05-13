package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    private WebDriver driver;


    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage clickLoginLink()   // this actions moves to another page -> so, we should make this method return the new page
    {
        //driver.findElement(loginLinkLocator).click();
        clickLink("Form Authentication");

        return new LoginPage(driver);
    }

    public DropDownPage clickDropDownLink()
    {
        //driver.findElement(dropDownLocator).click();
        clickLink("Dropdown");

        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink()
    {
        clickLink("Forgot Password");

        return new ForgotPasswordPage(driver);
    }

    public HoverPage clickHoverPageLink()
    {
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressPage clickKeyPressLink()
    {
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public SliderPage clickSliderLink()
    {
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }

    public AlertsPage clickAlertsLink()
    {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploadLink()
    {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAdLink()
    {
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    public ContextMenuPage clickContextMenuPage()
    {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public EditorPage clickEditorLink()
    {
        clickLink("WYSIWYG Editor");
        return new EditorPage(driver);
    }

    public FramesPage clickFramesLink()
    {
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOMLink()
    {
        clickLink("Large & Deep DOM");

        return new LargeAndDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollLink()
    {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsLink()
    {
        clickLink("Multiple Windows");

        return new MultipleWindowsPage(driver);
    }

    private void clickLink(String link)
    {
        String xpath = String.format("//a[text()='%s']" , link);
        driver.findElement(By.xpath(xpath)).click();
    }

}
