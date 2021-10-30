import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TestMethod  extends BasePage{

    public static By startShopping = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");


    @Step("Açılış")
    public void checkOpen() throws InterruptedException{
        TimeUnit.SECONDS.sleep(4);
        String checkText = driver.findElement(startShopping).getText();
        Assert.assertEquals("ALIŞVERİŞE BAŞLA",checkText);
        log.info("Uygulama acildi.");
    }
    @Step("Alışverişe Başla")
    public void clickShop() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(startShopping).click();
        log.info("Alisverise baslandı.");

    }
}
