package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitStrategies;

public class LessonsList {
    private WebDriver driver;
    public LessonsList(WebDriver driver) {
        this.driver = driver;
    }
    public LessonPage openLesson(int lessonNumber){
        By lessonLink = By.xpath("/html/body/div/div[1]/div/div/main/div[3]/ul/li["+lessonNumber+"]/div/a");
        WaitStrategies.waitPresentFn(driver,lessonLink);
        driver.findElement(lessonLink).click();
        return new LessonPage(driver);
    }
}
