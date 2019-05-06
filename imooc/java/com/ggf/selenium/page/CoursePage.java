package com.ggf.selenium.page;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.utils.ElementUtil;
import org.openqa.selenium.WebElement;

/**
 * Created by foresee on 2019/4/8.
 * 购买课程页面
 */
public class CoursePage extends BasePage
{

    public CoursePage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取立即购买按钮元素
     * @return
     */
    public WebElement getBuyTriggerElement() {
        return getElement(ElementUtil.getLocator("buyNowEle"));
    }

    /**
     * 获取添加购车元素
     * @return
     */
    public WebElement getAddCartElement() {
        return getElement(ElementUtil.getLocator("addCartEle"));
    }

    /**
     *获取购物车元素
     * @return
     */
    public WebElement getShopCartElement() {
        return getElement(ElementUtil.getLocator("cartEle"));
    }

    /**
     * 获取购物车数量元素
     * @return
     */
    public WebElement getShopCartNumElement() {
        return getElement(ElementUtil.getLocator("cartNumEle"));
    }

    /**
     * 获取课程信息元素
     * @return
     */
    public WebElement getCourseInfoElement() {
        return getNodeElement(ElementUtil.getLocator("courseInfoParentEle"), ElementUtil.getLocator("courseInfoEle"));
    }

}
