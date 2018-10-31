package ru.selenium.courses;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthTest {

    public ChromeDriver driver;
    public WebDriverWait wait;
    public WebElement h1;

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
    public void checkAuth() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElementByName("username").sendKeys("admin");
        driver.findElementByName("password").sendKeys("admin");
        driver.findElementByName("login").click();
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("My Store"));
        driver.findElementByClassName("name").click();
        checkH1Element();
        driver.findElementByLinkText("Logotype").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Catalog')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Product Groups')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Option Groups')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Manufacturers')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Suppliers')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Delivery Statuses')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Sold Out Statuses')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Quantity Units')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'CSV Import/Export')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Countries')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Currencies')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Customers')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'CSV Import/Export')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Newsletter')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Geo Zones')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Languages')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Storage Encoding')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Modules')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Background Jobs')]").click();
        checkH1Element();
        driver.findElementByXPath("//*[@id=\"doc-customer\"]/a").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Shipping')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Payment')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Order Total')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Order Success')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Order Action')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Orders')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Order Statuses')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Pages')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Reports')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Monthly Sales')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Most Sold Products')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Most Shopping Customers')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Settings')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Store Info')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Defaults')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'General')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Listings')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Images')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Checkout')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Advanced')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Security')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Slides')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Tax')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Tax Rates')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Translations')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Scan Files')]").click();
        checkH1Element();
        driver.findElementByXPath("//*[@id=\"doc-csv\"]/a/span").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'Users')]").click();
        checkH1Element();
        driver.findElementByXPath("//span[contains(text(),'vQmods')]").click();
    }
}
