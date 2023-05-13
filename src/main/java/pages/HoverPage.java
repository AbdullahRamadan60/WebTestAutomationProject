package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage
{
    WebDriver driver;
    By firstImageLocator = By.xpath("//h5[contains(text(),'user1')]");
    private final By boxCaption = By.className("figcaption");

    public HoverPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public FigureCaption hoverOnImageOfUsername(String username)
    {
        WebElement imageWebElement = driver.findElement(getImageLocatorByUserName(username));

        Actions actions = new Actions(driver);
        actions.moveToElement(imageWebElement);
        actions.perform();

        return new FigureCaption(imageWebElement.findElement(boxCaption));
    }


    public By getImageLocatorByUserName(String username)   //return By object of the figure using username
    {
        String xpath = String.format("//h5[contains(text(),'%s')]//ancestor::div[@class='figure']", username);
        return By.xpath(xpath);
    }

    public class FigureCaption  //Inner class to deal with figcaption web element (To get name and link of the selected figure)
    {
         WebElement caption;
        private final By nameHeader = By.tagName("h5");
        private final By link = By.tagName("a");

        public FigureCaption(WebElement caption)
        {
            this.caption = caption;
        }

        public boolean isFigureCaptionDisplayed()
        {
            return caption.isDisplayed();
        }

        public String getNameHeaderText()
        {
            return caption.findElement(nameHeader).getText();
        }

        public String getLink()
        {
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText()
        {
            return caption.findElement(link).getText();
        }


    }
}
