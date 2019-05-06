package com.ggf.selenium.handle;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.page.OrderPayPage;

/**
 * Created by foresee on 2019/4/11.
 */
public class OrderPayPageHandle {
    public DriverBase driver;
    public OrderPayPage orderPayPage;

    public OrderPayPageHandle(DriverBase driver) {
        this.driver = driver;
        this.orderPayPage = new OrderPayPage(driver);
    }

    /**
     * 获取订单编号
     * @return
     */
    public String getOrderNum() {
        return orderPayPage.getText(orderPayPage.getOrderNumElement());
    }

    /**
     * 获取订单中的课程信息
     * @return
     */
    public String getOrderCourseInfo() {
        return orderPayPage.getText(orderPayPage.getOrderCourseInfoElement());
    }

    /**
     * 点击支付方式
     */
    public void clickOrderPayWay() {
        orderPayPage.click(orderPayPage.getOrderPayWayElement());
    }

    /**
     * 点击支付按钮
     */
    public void clickOrderPayBtn() {
        orderPayPage.click(orderPayPage.getOrderPayBtnElement());
    }
}