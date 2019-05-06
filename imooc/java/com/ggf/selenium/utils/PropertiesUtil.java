package com.ggf.selenium.utils;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.Properties;

/**
 * Created by foresee on 2019/4/6.
 * 读取配置文件工具类
 */
public class PropertiesUtil {
    Logger log = Logger.getLogger(PropertiesUtil.class);

    // 读取完配置文件的对象
    private Properties prop;
    // 配置文件路径
    private String filePath;

    public PropertiesUtil(String filePath) {
        this.filePath  = filePath;
        this.prop = readProperties();
    }

    /**
     * 读取配置文件
     * @return
     */
    private Properties readProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new InputStreamReader(new FileInputStream(filePath),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
            log.error("读取配置文件异常！！");
        }

        return properties;
    }

    /**
     * 获取配置文件中的值
     * @param key
     * @return
     */
    public String getProperties(String key) {
        String value = "";
        if (prop.containsKey(key)) {
            value =  prop.getProperty(key);
        }else {
            log.debug("读取的【" + key + "】不存在！！");
        }

        return value;
    }


    public static void main(String[] args) {
        PropertiesUtil prout = new PropertiesUtil("D:\\study\\seleniumImooc\\java\\com\\ggf\\selenium\\config\\element.properties");
        System.out.println(prout.getProperties("addCartEle"));
    }
}
