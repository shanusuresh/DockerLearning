import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UdemyTest {

    private WebDriver driver;
    @BeforeTest
    public void setDriver(){
    driver = new ChromeDriver();
    }

    @Test
    public void test(){
        driver.get("www.google.com");
        driver.findElement(By.id("q")).sendKeys("Udemy");
    }

    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
