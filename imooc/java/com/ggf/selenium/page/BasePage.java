package com.ggf.selenium.page;

import com.ggf.selenium.base.DriverBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by foresee on 2019/4/6.
 * 页面公用类
 */
public class BasePage {
    Logger log = Logger.getLogger(BasePage.class);

    // 定义一个DriverBase
    DriverBase driver;

    public BasePage(DriverBase driver) {
        this.driver = driver;
    }

    /**
     * 定位元素方法
     * @param by
     * @return
     */
    public WebElement getElement(By by) {
        WebElement element = driver.getElement(by);
        return element;
    }

    /**
     * 层级定位，通过父节点获取子节点
     * @param by 父节点
     * @param nodeBy 子节点
     * @return
     */
    public WebElement getNodeElement(By by, By nodeBy) {
        WebElement parentEle = this.getElement(by);
        return parentEle.findElement(nodeBy);
    }

    /**
     * 页面点击方法
     * @param element
     */
    public void click(WebElement element) {
        if (element != null) {
            element.click();
        }else {
            log.error("元素不存在，点击失败");
        }
    }

    /**
     * 页面内容输入
     * @param element
     * @param value
     */
    public void sendKeys(WebElement element, String value) {
        if (element != null) {
            element.sendKeys(value);
        }else {
            log.error("元素不存在，无法输入内容！");
        }
    }

    /**
     * 判断页面元素是否存在
     * @param element
     * @return
     */
    public boolean assertElementIs(WebElement element) {
        return element.isDisplayed();
    }

    /**
     * 获取元素文本信息
     * @param element
     * @return
     */
    public String getText(WebElement element) {
        return element.getText();
    }
}
