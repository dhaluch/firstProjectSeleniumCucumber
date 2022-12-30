package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class IndexPage extends Utils {
    WebDriver driver;

    public IndexPage(WebDriver driver){
        this.driver = driver;
    }

    public void acessaDemoAutomation(){
        driver.get("https://demo.automationtesting.in/Index.html");
    }

    public void clickSkipSignIn(){
        driver.findElement(By.id("btn2")).click();
    }
}
