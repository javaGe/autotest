package com.ggf.selenium.page;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.utils.ElementUtil;
import org.openqa.selenium.WebElement;

/**
 * Created by foresee on 2019/4/11.
 */
public class OrderPayPage extends BasePage {
    public OrderPayPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取订单编号元素
     * @return
     */
    public WebElement getOrderNumElement() {
        return getElement(ElementUtil.getLocator("orderNumEle"));
    }

    /**
     * 获取课程名称元素
     * @return
     */
    public WebElement getOrderCourseInfoElement() {
        return getNodeElement(ElementUtil.getLocator("courseNameParentEle"), ElementUtil.getLocator("courseNameEle"));
    }

    /**
     * 获取支付方式元素
     * @return
     */
    public WebElement getOrderPayWayElement() {
        return getElement(ElementUtil.getLocator("payWayEle"));
    }

    /**
     * 获取立即支付按钮元素
     * @return
     */
    public WebElement getOrderPayBtnElement() {
        return getElement(ElementUtil.getLocator("orderPayBtnEle"));
    }
}
