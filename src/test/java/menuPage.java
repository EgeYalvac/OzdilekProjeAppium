import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class menuPage extends BasePage{

public static By kadin=By.xpath("//android.widget.RelativeLayout[@index='1']");
public static By pantalon=By.xpath("//android.widget.RelativeLayout[@index='3']");
public static By selectPantalon=By.id("com.ozdilek.ozdilekteyim:id/textView");

    @Step("Menu")
    public void clickKadın() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(kadin).click();
        log.info("Kadin Secimi Yapildi.");
    }
    @Step("MenuPantalon")
    public void clickPantalon() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(pantalon).click();
        TimeUnit.SECONDS.sleep(3);
        log.info("Pantalon Secimi Yapildi.");
    }
    @Step("scroll")
    public void ScrollRandomPos() throws InterruptedException {
        Dimension dimension = driver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(start_x,start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();
        TimeUnit.SECONDS.sleep(2);
    }
    @Step("scroll2")
    public void ScrollRandomPos1() {
        Dimension dimension = driver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(start_x,start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();
        log.info("Sayfa 2 kere scroll edildi.");
    }

    @Step("select pantalon")
    public void selectPantalon() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        List<MobileElement> items = driver.findElements(selectPantalon);
        items.get(2).click();
        TimeUnit.SECONDS.sleep(1);
        log.info("Random Pantalon Secimi Yapildi.");
    }
}
