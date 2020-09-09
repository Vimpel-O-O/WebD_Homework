import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Xpath {

    WebDriver driver;

    @BeforeSuite
    private void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test0001() {
        //TODO: try to find the element with contains()
        openPage();
        String xpath01 = "//a[contains(@href,'https://news.yahoo.com/coronavirus')]";
        driver.findElement(By.xpath(xpath01)).click();

    }

    private void openPage() {
        driver.get("https://www.yahoo.com/");
    }
}

