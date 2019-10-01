import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CssSelectorId {
    public static void main(String[] args) throws InterruptedException {
        Browsers myBrowsers = new Browsers();
        WebDriver driver = myBrowsers.invokeChrome();
        driver.get("http://www.expedia.com/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys("Atlanta");
        Thread.sleep(1000);
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ARROW_DOWN);
        }
        driver.findElement(By.cssSelector("input#package-origin-hp-package")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-destination-hp-package")).sendKeys("Las Vegas");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-departing-hp-package")).clear();
        driver.findElement(By.cssSelector("#package-departing-hp-package")).sendKeys("11/11/2019");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-returning-hp-package")).clear();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#package-returning-hp-package")).sendKeys("11/21/2019");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#partialHotelBooking-hp-package")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#search-button-hp-package")).click();
















    }
}
