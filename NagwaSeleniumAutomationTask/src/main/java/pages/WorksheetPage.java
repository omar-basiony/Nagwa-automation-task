package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitStrategies;

import java.util.List;

public class WorksheetPage {
    private WebDriver driver;
    public WorksheetPage(WebDriver driver) {
    this.driver = driver;
    }
    public int countQuestions(){
        By questionList = By.tagName("b");
        WaitStrategies.waitPresentFn(driver,questionList);
        List<WebElement> questions = driver.findElements(questionList);
        return questions.size();
    }
}
