package utils;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverManager {
    public static ChromeOptions options;
    private static WebDriver driver;
    private static final DriverConfig cfg = ConfigFactory.create(DriverConfig.class);
    public static synchronized WebDriver initOrGetDriver(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");

        if (driver == null) {
            driver = new ChromeDriver(options);
            driver.get(cfg.url());
        }
        return driver;
    }
}
