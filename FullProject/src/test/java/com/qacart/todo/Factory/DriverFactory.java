package com.qacart.todo.Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
   private WebDriver driver;
    public WebDriver InitializeDriver(){

        String browser = System.getProperty("browser","CHROME");
        switch (browser){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions option = new ChromeOptions();
               option.addArguments("--remote-allow-origins=*");
                 driver = new ChromeDriver(option);
                break;

            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("The Browser is Not Supported");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        //driver.manage().window().maximize();
        return driver;
    }
}
