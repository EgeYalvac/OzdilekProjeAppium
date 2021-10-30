import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class shoppingPage extends BasePage  {
    public static By shoppingPage= By.id("com.ozdilek.ozdilekteyim:id/tvMarketName");
    public static By Category= By.id("com.ozdilek.ozdilekteyim:id/nav_categories");
    public static By checkCatagory= By.xpath("//android.widget.LinearLayout[@content-desc=\"Kategoriler\"]/android.widget.TextView");


    @Step("AlışverişKontrol")
    public void checkingShoppingPage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        String checkText = driver.findElement(shoppingPage).getText();
        Assert.assertEquals("Market",checkText);
        log.info("Alisveris sayfasi kontrolu yapildi.");

    }
    @Step("Katagori")
    public void category() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(Category).click();
        log.info("Katagori sayfasina tiklandi.");
    }
    @Step("Katagori check")
    public void categoryChecking() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        String checkCategory =driver.findElement(checkCatagory).getText();
        Assert.assertEquals("Kategoriler",checkCategory);
        log.info("Kategori sayfasi kontrol edildi.");
    }






}
