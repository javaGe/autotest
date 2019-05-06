package com.ggf.selenium.business;

import com.ggf.selenium.base.DriverBase;
import com.ggf.selenium.handle.CoursePageHandle;

/**
 * Created by foresee on 2019/4/9.
 * 课程业务操作类
 */
public class CoursePagePro {
    public DriverBase driver;
    public CoursePageHandle cph;

    public CoursePagePro(DriverBase driver) {
        this.driver = driver;
        this.cph = new CoursePageHandle(driver);
    }

    /**
     * 添加商品到购物车
     */
    public void addCart() {
        // 获取当前购物车数量
        int currentNum;
        try {
            currentNum = Integer.valueOf(cph.getShopCartNum());
        }catch (Exception e) { // 如果当前购物车没有数量，给它复值为：0
            currentNum = 0;
        }

        // 添加课程到购物车
        cph.clickAddCart();
        // 再次获取购物车数量
        int afterNum = Integer.valueOf(cph.getShopCartNum());

        // 判断数量，比较是否添加成功
        if (afterNum == currentNum + 1) {
            System.out.println("成功添加课程到购物车中！！");
        }

    }

    /**
     * 点击立即购买
     */
    public void buyNow() {
        cph.clickBuyNow();
    }

}
