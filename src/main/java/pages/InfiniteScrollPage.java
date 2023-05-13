package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class InfiniteScrollPage
{
    WebDriver driver;

    public final By paragraphLocator = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver)
    {
        this.driver = driver;
    }

    /**
     *
     * @param index 1-based index
     */
    public void scrollToParagraphNo(int index)
    {
        int height = driver.findElement(By.tagName("body")).getSize().getHeight();
        Actions actions = new Actions(driver);


        while (getNumberOfPresentedParagraphs() < index)
        {
            actions.scrollByAmount(0, height);
            actions.perform();
        }
    }

    public boolean isParagraphDisplayed(int index)
    {
        return driver.findElements(paragraphLocator).get(index - 1).isDisplayed();
    }

    public int getNumberOfPresentedParagraphs()
    {
        return driver.findElements(paragraphLocator).size();
    }

}
