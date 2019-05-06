package com.ggf.selenium.handle;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.page.CoursePage;
import org.openqa.selenium.WebElement;

/**
 * Created by foresee on 2019/4/8.
 * 课程页面操作类
 */
public class CoursePageHandle {
    public DriverBase driver;
    public CoursePage coursePage;

    public CoursePageHandle(DriverBase driver){
        this.driver = driver;
        this.coursePage = new CoursePage(driver);
    }

    /**
     * 点击立即购买按钮
     */
    public void clickBuyNow() {
        coursePage.click(coursePage.getBuyTriggerElement());
    }

    /**
     * 点击添加到购物车按钮
     */
    public void clickAddCart() {
        coursePage.click(coursePage.getAddCartElement());
    }

    /**
     * 点击购物车按钮
     */
    public void clickShopCart() {
        coursePage.click(coursePage.getShopCartElement());
    }

    /**
     * 获取购物车数量
     * @return
     */
    public String getShopCartNum() {
        WebElement numEle = coursePage.getShopCartNumElement();
        return coursePage.getText(numEle);
    }

    /**
     * 获取购买课程的信息
     * @return
     */
    public String getCourseInfo() {
        WebElement courseInfo = coursePage.getCourseInfoElement();
        return coursePage.getText(courseInfo);
    }
}
