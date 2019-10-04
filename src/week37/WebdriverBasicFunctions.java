package week37;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasicFunctions {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/hakkiyaz/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com/");
        System.out.println("The title of the webpage is "+driver.getTitle());
        driver.navigate().to("http://www.amazon.com/");
        System.out.println("The title of the webpage is "+driver.getTitle());
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println("*************************************************************");
        System.out.println(driver.getPageSource());
        driver.close();
    }
}
