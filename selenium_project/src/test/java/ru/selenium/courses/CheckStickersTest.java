package ru.selenium.courses;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;


//Задание 8. Сделайте сценарий, проверяющий наличие стикеров у товаров
public class CheckStickersTest extends AuthTunes {

    int productOnPageCount,stickerListCount;
    private     List<WebElement> imageWrapper;

    @Test
    public void checkStickers() throws InterruptedException {
        driver.get("http://localhost/litecart/en/");
        int productOnPageCount = driver.findElementsByClassName("image-wrapper").size();
        for (int i = 0; i < productOnPageCount; i++) {
            imageWrapper = driver.findElementsByClassName("image-wrapper");
            imageWrapper.get(i);
            System.out.println("Всео элементов" + productOnPageCount);
            int stickerListCount = driver.findElementsByCssSelector("li.product .sticker").size();
                System.out.println("всего стикеров:" + stickerListCount);
                Assert.assertTrue(stickerListCount == productOnPageCount);
            }
        }
    }


