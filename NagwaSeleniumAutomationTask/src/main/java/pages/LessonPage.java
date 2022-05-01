package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitStrategies;

public class LessonPage {
    private WebDriver driver;
    public LessonPage(WebDriver driver) {
        this.driver = driver;
    }
    public WorksheetPage openWorksheet(){
        By worksheetLink = By.linkText("Lesson Worksheet");
        WaitStrategies.waitPresentFn(driver,worksheetLink);
        driver.findElement(worksheetLink).click();
        return new WorksheetPage(driver);
    }
}
