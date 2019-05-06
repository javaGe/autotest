package com.ggf.selenium.testcase;

import com.ggf.selenium.base.DriverBase;

/**
 * Created by foresee on 2019/4/6.
 * 用例基类
 * 用于初始化driver
 */
public class CaseBase {
    /**
     * 初始化driver
     * @param browser
     * @return
     */
    public DriverBase initDriver(String browser) {
        return new DriverBase(browser);
    }
}
