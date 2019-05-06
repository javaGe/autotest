package com.ggf.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by foresee on 2019/4/5.
 * driver基类
 */
public class DriverBase {
    public WebDriver driver;

    // 初始化webdriver
    public DriverBase(String browser) {
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }


    /**
     * 封装get方法
     * @param url
     */
    public void get(String url) {
        driver.get(url);
    }
    /**
     * 关闭方法
     */
    public void stop() {
        System.out.println("webdriver stop!");
        driver.close();
    }

    /**
     * 封装一个获取webelement的方法
     * @param by
     * @return
     */
    public WebElement getElement(By by) {
        return driver.findElement(by);
    }

    /**
     * 封装返回方法
     */
    public void back() {
        driver.navigate().back();
    }

    /**
     *  强制等待。
     * @param value 秒值
     */
    public void loadWait(long value) {
        try {
            Thread.sleep(value * 1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 跳转到alert弹出框
     */
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    /**
     * 跳转到模态弹框，自定义的弹出框。
     */
    public void switchToModel() {
        driver.switchTo().activeElement();
    }
}
