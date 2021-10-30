import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class backProductPage extends BasePage {
    public static By selectAgainPantalon=By.id("com.ozdilek.ozdilekteyim:id/textView");
    public static By size=By.id("com.ozdilek.ozdilekteyim:id/relLaySizeIn");// com.ozdilek.ozdilekteyim:id/relLaySizeIn

    @Step("againSelectPant")
    public void selectAgainPantalon() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        List<MobileElement> items = driver.findElements(selectAgainPantalon);
        items.get(1).click();
        TimeUnit.SECONDS.sleep(1);
        log.info("Random Pantalon Secimi Yapildi.");

    }
    @Step("selectSize")
    public  void selectSizePant() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        List<MobileElement> items = driver.findElements(size);
        items.get(0).click();
        log.info("Beden Secimi Yapildi.");
    }
    @Step("goBasket")
    public void goBasket    () throws InterruptedException {
        driver.findElement(By.id("com.ozdilek.ozdilekteyim:id/cardAddToCart")).click();
        log.info("Urun Sepete eklendi");
        TimeUnit.SECONDS.sleep(2);

    }

}
