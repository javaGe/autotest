package com.ggf.selenium.utils;

import org.openqa.selenium.By;

/**
 * Created by foresee on 2019/4/6.
 * 操作element的工具类
 */
public class ElementUtil {
    /**
     * 定位元素的方式
     * 通过读取配置文件中的值，来获取对应的定位方式
     * @param key 配置文件中的key
     * @return
     */
    public static By getLocator(String key) {
        By by = null;

        PropertiesUtil pt = new PropertiesUtil("D:\\study\\seleniumImooc\\java\\com\\ggf\\selenium\\config\\element.properties");
        String locator = pt.getProperties(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];

        if ("id".equalsIgnoreCase(locatorType)) {
            by = By.id(locatorValue);
        }else if ("name".equalsIgnoreCase(locatorType)) {
            by = By.name(locatorValue);
        }else if ("className".equalsIgnoreCase(locatorType)) {
            by = By.className(locatorValue);
        }else if ("xpath".equalsIgnoreCase(locatorType)) {
            by = By.xpath(locatorValue);
        }else if ("tagName".equalsIgnoreCase(locatorType)) {
            by = By.tagName(locatorValue);
        }else if ("linkText".equalsIgnoreCase(locatorType)) {
            by = By.linkText(locatorValue);
        }

        return by;
    }
}
