import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {
    public static By Back=By.id("com.ozdilek.ozdilekteyim:id/ivBack");
    public static By Back2=By.id("com.ozdilek.ozdilekteyim:id/ivBack");

    @Step("login")
    public  void mailAndPassword() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        WebElement element = driver.findElement(By.id("com.ozdilek.ozdilekteyim:id/etEposta"));
        element.sendKeys("TestiniumDeneme");
        WebElement element1 = driver.findElement(By.id("com.ozdilek.ozdilekteyim:id/etPassword"));
        element1.sendKeys("12345678");
        log.info("Mail ve Password girisi yapıldı.");
    }
    @Step("back")
    public void back1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(Back).click();
        log.info("Back");

    }
    @Step("back2")
    public void back2() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(Back2).click();
        log.info("Back Again");

    }
}
