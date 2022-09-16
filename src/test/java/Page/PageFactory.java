package Page;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private Homepage homepage;
    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }
    public Homepage homepage() {
        if (homepage == null) {
            homepage = new Homepage(driver);
        }
        return homepage;
    }
}




