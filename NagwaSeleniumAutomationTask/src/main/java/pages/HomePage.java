package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.WaitStrategies;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public LessonsList searchForLesson(String lesson){
        By searchIcon = By.xpath("//header/div[1]/div[1]/div[3]/button[1]/i[1]");
        WaitStrategies.waitPresentFn(driver,searchIcon);
        driver.findElement(searchIcon).click();
        By searchBox = By.xpath("//input[@id='txt_search_query']");
        WaitStrategies.waitPresentFn(driver,searchBox);
        driver.findElement(searchBox).sendKeys(lesson);
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
        return new LessonsList(driver);
    }
}
