import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
    static WebDriver driver;
    public static void main(String[] args) {
        invokeChrome();
        driver.get("http://www.facebook.com/");
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
    }

    public static void invokeChrome() {
        System.setProperty("webdriver.chrome.driver","/Users/hakkiyaz/Downloads/chromedriver");
        driver = new ChromeDriver();
    }
}
