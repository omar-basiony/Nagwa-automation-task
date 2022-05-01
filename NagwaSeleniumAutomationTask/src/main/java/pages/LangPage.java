package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitStrategies;

public class LangPage {
    private WebDriver driver;

    public LangPage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage selectLanguage(String language){
        WaitStrategies.waitPresentFn(driver,By.xpath("//a[contains(text(),'"+language+"')]"));
        driver.findElement(By.xpath("//a[contains(text(),'"+language+"')]")).click();
        return new HomePage(driver);
    }
}
