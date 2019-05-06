package com.ggf.selenium.business;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.handle.OrderPayPageHandle;

/**
 * Created by foresee on 2019/4/11.
 */
public class OrderPayPro {
    public DriverBase driver;
    public OrderPayPageHandle opph;

    public OrderPayPro(DriverBase driver) {
        this.driver = driver;
        this.opph = new OrderPayPageHandle(driver);
    }

    /**
     * 订单支付
     * 需要判断，订单编号和课程信息都不为空时，才进行支付
     */
    public void orderPay() {
        String orderNum = opph.getOrderNum();
        String courseInfo = opph.getOrderCourseInfo();

        if (orderNum != null && courseInfo != null) {
            opph.clickOrderPayWay();
            opph.clickOrderPayBtn();
        }
    }

}
