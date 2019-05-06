package com.ggf.selenium.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by foresee on 2019/4/5.
 * 根据传入浏览器名称生成不同的webdriver
 */
public class SelectDriver {
    Logger log = Logger.getLogger(SelectDriver.class);

    public WebDriver driverName(String browserName) {
        // 创建Webdriver对象
        WebDriver driver = null;
        // 判断不同的浏览器
        if ("Chrome".equalsIgnoreCase(browserName)) {
            log.debug("当前使用的浏览器为【Chrome】" );
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\foresee\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if ("fireFox".equalsIgnoreCase(browserName)) {
            log.debug("当前使用的浏览器为【fireFox】" );
            driver = new FirefoxDriver();
        }else if ("ie".equalsIgnoreCase(browserName)) {
            log.debug("当前使用的浏览器为【IE】" );
            driver = new InternetExplorerDriver();
        }

        return driver;
    }

    public static void main(String[] args) {
        SelectDriver driver = new SelectDriver();
        System.out.println(driver.driverName("Chrome"));

    }

}
