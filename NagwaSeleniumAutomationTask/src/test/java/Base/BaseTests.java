package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.HomePage;
import pages.LangPage;

public class BaseTests {
    private EventFiringWebDriver driver;
    protected LangPage langPage;
    protected HomePage homPage;
    protected String url = "https://www.nagwa.com/";
    @Parameters({"browser"})
    @BeforeClass
    public void setUp(String param){
        if (param.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new EventFiringWebDriver(new ChromeDriver());}

        if(param.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new EventFiringWebDriver(new FirefoxDriver());}

        driver.manage().window().maximize();
        driver.get(url);
        langPage = new LangPage(driver);
        }
}
