package com.ggf.selenium.page;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.utils.ElementUtil;
import org.openqa.selenium.WebElement;

/**
 * Created by foresee on 2019/4/10.
 */
public class SureOrderPage extends BasePage {
    public SureOrderPage(DriverBase driver) {
        super(driver);
    }

    public WebElement getSubOrderElement() {
        return getElement(ElementUtil.getLocator("sureOrdEle"));
    }
}
