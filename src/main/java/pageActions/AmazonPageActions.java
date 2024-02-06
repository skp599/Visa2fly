package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPageActions {

    private WebDriver driver;

    public AmazonPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMobileTopRight() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
    }

    public void clickIphone13() {
        driver.findElement(By.xpath("//*[@id=\"sobe_d_b_14_1\"]/a/div[1]/img")).click();
    }

    public void clickAddToCart() throws InterruptedException {
        driver.findElement(By.cssSelector("input[name='submit.add-to-cart'][type='submit']")).click();

    Thread.sleep(5000);
    }


    public void clickCartButton() {
        driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
    }

    public void clickProceedToBuy() {
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
    }
}
