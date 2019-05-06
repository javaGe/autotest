package com.ggf.selenium.testcase;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.business.CoursePagePro;
import com.ggf.selenium.business.LoginPro;
import com.ggf.selenium.business.OrderPayPro;
import com.ggf.selenium.business.SureOrderPro;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by foresee on 2019/4/6.
 * 登录用例
 */
public class Login extends CaseBase{
    public DriverBase driver;
    public LoginPro lp;
    public CoursePagePro cpp;
    public SureOrderPro sop;
    public OrderPayPro opp;

    @BeforeClass
    public void init() {
        this.driver = initDriver("Chrome");
        this.lp = new LoginPro(driver);
        this.cpp = new CoursePagePro(driver);
        this.sop = new SureOrderPro(driver);
        this.opp = new OrderPayPro(driver);
    }

    /**
     * 进入登录主页面
     */
    @Test
    public void getLoginHome() {
        driver.get("https://www.imooc.com/user/newlogin");
    }

    /**
     * 测试登录
     */
    @Test(dependsOnMethods = {"getLoginHome"})
    public void testLogin() {
        lp.login("", "");
        driver.loadWait(5);
    }

    /**
     * 购买课程
     */
    @Test(dependsOnMethods = {"testLogin"})
    public void testAddCart() {
        // 进入商品页面
        driver.get("https://coding.imooc.com/class/203.html");
        driver.loadWait(3);
//        cpp.addCart();
        cpp.buyNow();
        driver.loadWait(1);
    }

    @Test(dependsOnMethods = {"testAddCart"})
    public void testSureOrder() {
        sop.sureOrder();
        driver.loadWait(1);
    }

    /**
     * 支付
     */
    @Test(dependsOnMethods = {"testSureOrder"})
    public void testOrderBuy() {
        opp.orderPay();
    }

    @AfterClass
    public void testStop() {
        driver.stop();
    }

//    public static void main(String[] args) {
//        Login login = new Login();
//        login.getLoginHome();
//        login.testLogin();
//    }
}
