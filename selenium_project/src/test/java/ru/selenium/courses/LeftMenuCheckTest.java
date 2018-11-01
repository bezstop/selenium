package ru.selenium.courses;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import static java.lang.Thread.sleep;

public class LeftMenuCheckTest {

    public ChromeDriver driver;
    public WebDriverWait wait;
    public WebElement h1;
    List<WebElement> elementsMenu, submenuElements;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/QA/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void close() {
        driver.quit();
    }

    public void checkH1Element() {
        h1 = driver.findElementByCssSelector("h1");
        Assert.assertTrue(h1.isEnabled());
    }

    @Test
    public void checkAuth() throws InterruptedException {
        driver.get("http://localhost/litecart/admin/");
        driver.findElementByName("username").sendKeys("admin");
        driver.findElementByName("password").sendKeys("admin");
        driver.findElementByName("login").click();
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("My Store"));

        int count = driver.findElementsById("app-").size();
        //поиск по заголовку меню
        for (int i = 0; i < count; i++) {
            elementsMenu = driver.findElementsById("app-");
            elementsMenu.get(i).click();
            checkH1Element();
            //поиск по внутренним элементам меню
            submenuElements = driver.findElementsByCssSelector("ul.docs li");
            int newCount = driver.findElementsByCssSelector("ul.docs li").size();
            if (submenuElements.size() !=0) {
                for (int j = 0; j < newCount; j++) {
                    submenuElements = driver.findElementsByCssSelector("ul.docs li");
                    submenuElements.get(j).click();
                    checkH1Element();
                }
            }
            sleep(1000);
        }
    }
}


