package com.ggf.selenium.page;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.utils.ElementUtil;
import org.openqa.selenium.WebElement;

/**
 * Created by foresee on 2019/4/6.
 * 登录页面类
 * 主要用于获取页面元素
 */
public class LoginPage extends BasePage{
    public LoginPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取用户名输入框元素
     * @return
     */
    public WebElement getUserElement() {
        return getElement(ElementUtil.getLocator("userElem"));
    }

    /**
     * 获取密码输入框元素
     * @return
     */
    public WebElement getPassElement() {
        return getElement(ElementUtil.getLocator("passElem"));
    }


    /**
     * 获取登录按钮元素
     * @return
     */
    public WebElement getLoginBtnElement() {
        return getElement(ElementUtil.getLocator("loginBtnElem"));
    }

    /**
     * 获取自动登录元素
     * @return
     */
    public WebElement getAutoSigninElement() {
        return getElement(ElementUtil.getLocator("autoSigninElem"));
    }
}
