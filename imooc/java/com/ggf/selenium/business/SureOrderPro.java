package com.ggf.selenium.business;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.handle.SureOrderHandle;

/**
 * Created by foresee on 2019/4/11.
 */
public class SureOrderPro {
    public DriverBase driver;
    public SureOrderHandle sureOrderHandle;

    public SureOrderPro(DriverBase driver){
        this.driver = driver;
        sureOrderHandle = new SureOrderHandle(driver);
    }


    /**
     * 确认订单按钮
     */
    public void sureOrder() {
        sureOrderHandle.clickSubOrderElement();
    }

}
