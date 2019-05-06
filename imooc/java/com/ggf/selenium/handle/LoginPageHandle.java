package com.ggf.selenium.handle;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.page.LoginPage;

/**
 * Created by foresee on 2019/4/6.
 * 登录页面操作类
 * 对元素进行操作
 */
public class LoginPageHandle {
    // 初始化时需要一个driver
    public DriverBase driver;
    // 需要页面对象
    public LoginPage lp;

    public LoginPageHandle(DriverBase driver) {
        this.driver = driver;
        this.lp = new LoginPage(driver);
    }

    /**
     * 输入用户名
     * @param user
     */
    public void sendKeyUser(String user) {
        lp.sendKeys(lp.getUserElement(), user);
    }

    /**
     * 输入密码
     * @param pass
     */
    public void sendKeyPass(String pass) {
        lp.sendKeys(lp.getPassElement(), pass);
    }

    /**
     * 点击登录
     */
    public void clickLoginBtn() {
        lp.click(lp.getLoginBtnElement());
    }

    /**
     * 勾选自动登录
     */
    public void clickAutoSignin() {
        lp.click(lp.getAutoSigninElement());
    }

    /**
     * 判断是否是登录页面
     * @return
     */
    public boolean assertLoginPage() {
        return lp.assertElementIs(lp.getUserElement());
    }
}
