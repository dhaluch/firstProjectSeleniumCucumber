package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.Json", "html:target/reports/"},
        features = "src/test/resources/features",
        tags = {"~@ignore"},
        glue = {"steps"}
)
public class RunCucumberTest {
    public  static ChromeDriver driver;
    public static ChromeOptions options;

    @BeforeClass
    public static void start(){
        options = new ChromeOptions();
        options.addArguments("star-maximized");
        driver = new ChromeDriver(options);

    }
    @BeforeClass
    public static void stop(){
        driver.quit();
    }
}
