package com.ggf.selenium.business;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.handle.LoginPageHandle;
import org.apache.log4j.Logger;

/**
 * Created by foresee on 2019/4/6.
 * 业务层登录类
 * 主要用于业务逻辑控制
 */
public class LoginPro {
    Logger log = Logger.getLogger(LoginPro.class);

    public LoginPageHandle lph;

    public LoginPro(DriverBase driver) {
        this.lph = new LoginPageHandle(driver);
    }

    /**
     * 登录业务功能
     * @param user
     * @param pass
     */
    public void login(String user, String pass) {
        // 判断页面的有效性
        if (lph.assertLoginPage()) {

            lph.sendKeyUser(user);
            lph.sendKeyPass(pass);
            lph.clickLoginBtn();
        }else {
            log.error("登录页面不存在！！");
        }

    }
}
