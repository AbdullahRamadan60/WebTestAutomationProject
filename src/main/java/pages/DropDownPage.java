package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class DropDownPage
{
    WebDriver driver;

    private final By selectMenuLocator = By.id("dropdown");

    public DropDownPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void selectOption(String option)
    {
        Select select = new Select(driver.findElement(selectMenuLocator));

        select.selectByVisibleText(option);
    }

    public List<String> getTheSelectedOptions()
    {
        Select select = new Select(driver.findElement(selectMenuLocator));

        List<WebElement> selectedElementsList = select.getAllSelectedOptions();

        List<String> selectedOptionsList = new ArrayList<>();

        for(int i = 0  ; i < selectedElementsList.size() ; i++)
        {
            selectedOptionsList.add(selectedElementsList.get(i).getText());
        }
        return selectedOptionsList;
    }


}
