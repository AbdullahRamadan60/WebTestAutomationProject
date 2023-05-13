package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;

public class WindowManager
{
    WebDriver driver;

    WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver)
    {
        this.driver = driver;

        navigate = driver.navigate();
    }

    public void goBack()
    {
        navigate.back();
    }

    public void goForward()
    {
        navigate.forward();
    }

    public void refreshPage()
    {
        navigate.refresh();
    }

    public void goTo(String url)
    {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle)
    {
        var windows = driver.getWindowHandles();

        System.out.println("The number of tabs : " + windows.size());

        System.out.println("Window Handles");
        windows.forEach(System.out::println);

        for(String window :  windows)
        {
            System.out.println("Switching to window : " + window);
            driver.switchTo().window(window);

            System.out.println("The current window title : " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle()))
            {
                break;
            }
        }
    }

    public void switchToTab(int index)
    {
        var windows = driver.getWindowHandles();

        System.out.println("The number of tabs : " + windows.size());

        System.out.println("Window Handles");
        windows.forEach(System.out::println);


        String requiredWindowHandle = "";

        Iterator<String> it = windows.iterator();

        for(int i = 0 ; i < index ; i++)
        {
            requiredWindowHandle = it.next();
        }

        driver.switchTo().window(requiredWindowHandle);
    }




}
