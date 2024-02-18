package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class GuiTasks {

     public Properties appProps;

    public Properties readPropertyFile(){
        String appConfigPath = "src/main/resources/application.properties";
        appProps = new Properties();
        try {
            appProps.load(new FileInputStream(appConfigPath));
        }
        catch(Exception exception){
            System.out.println("Could not find/open the property file");
            exception.printStackTrace();
        }
        return appProps;
    }


    public WebDriver login(){
        String url = appProps.getProperty("url");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        return driver;
    }

    public void logout(WebDriver driver){
        driver.close();
    }


}
