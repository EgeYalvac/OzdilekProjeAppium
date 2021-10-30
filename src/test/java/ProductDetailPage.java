import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ProductDetailPage extends BasePage{
    public static By details=By.id("com.ozdilek.ozdilekteyim:id/tvSizeDesc");
    public static By Fav=By.id("com.ozdilek.ozdilekteyim:id/imgAddFav");
    @Step("detail")
    public void detailPant() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        String checkDetail = driver.findElement(details).getText();
        Assert.assertEquals("Beden:",checkDetail);
        log.info("Urun sayfası Kontrolu yapildi..");
    }
    @Step("addFav")
    public void addFav() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(Fav).click();
        log.info("Favorilere Eklendi.");
    }
}
