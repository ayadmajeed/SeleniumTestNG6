package Navigate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:/google.com");
        driver.navigate().to("https://www.rudaw.net/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
