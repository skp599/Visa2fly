package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageActions.AmazonPageActions;

public class AddToCartSteps {

    private WebDriver driver;
    private AmazonPageActions amazonPage;

    @Given("I open Amazon website")
    public void openAmazonWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        amazonPage = new AmazonPageActions(driver);
    }

    @When("I click on Mobile on top right")
    public void clickMobileTopRight() {
        amazonPage.clickMobileTopRight();
    }

    @Then("I scroll down and click on iphone 13 under Bestselling premium smartphones")
    public void clickIphone13() {
        amazonPage.clickIphone13();
    }

    @Then("I scroll down and click on add to cart button in the left side")
    public void clickAddToCart() throws InterruptedException {
        amazonPage.clickAddToCart();
    }

    @Then("I click on Cart button under Added to Cart popup in the left side")
    public void clickCartButton() {
        amazonPage.clickCartButton();
    }

    @Then("I click on proceed to buy button in the left side")
    public void clickProceedToBuy() {
        amazonPage.clickProceedToBuy();
    }
}
