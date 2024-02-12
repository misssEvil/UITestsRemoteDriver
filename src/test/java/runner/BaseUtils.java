package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseUtils {

    private static Properties properties;
    private static final ChromeOptions chromeOptions;

    static{

        chromeOptions = new ChromeOptions();
        //String options = "--start-maximized";
        chromeOptions.addArguments("--headless");

        WebDriverManager.chromedriver().setup();
    }

    static WebDriver createDriver(){
        //WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriver driver = new RemoteWebDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
