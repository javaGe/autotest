package com.ggf.selenium.handle;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.page.SureOrderPage;

/**
 * Created by foresee on 2019/4/11.
 */
public class SureOrderHandle {
    public SureOrderPage sureOrderPage;
    public DriverBase driver;

    public SureOrderHandle(DriverBase driver){
        this.driver = driver;
        sureOrderPage = new SureOrderPage(driver);

    }

    /**
     * 点击提交订单按钮
     */
    public void clickSubOrderElement() {
        sureOrderPage.click(sureOrderPage.getSubOrderElement());
    }
}
