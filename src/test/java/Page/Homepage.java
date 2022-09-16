package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {

    WebDriver driver;
    WebDriverWait wait;

By Computers= By.xpath("//a [contains(text(), 'computers')])[1]");
By clicknoteBooks = By.xpath("*//a[contains(text(),'Notebooks')])");
By VerifySixItemsAreShown = By.xpath("*//div[@class='page-title']");
By AddtoCart = By.xpath("(//button[contains(text(),'Add to cart')])[2]");

    public Homepage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void homepage() {
        driver.findElement(Computers).click();
        driver.findElement(clicknoteBooks).click();
        driver.findElement(VerifySixItemsAreShown).click();
        driver.findElement(AddtoCart).click();
    }
}
