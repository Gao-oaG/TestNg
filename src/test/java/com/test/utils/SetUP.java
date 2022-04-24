package com.test.utils;

import org.openqa.selenium.chrome.ChromeOptions;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class SetUP {
    //chromedriver路径
    public void setProperty() {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\driver/chromedriver.exe");
    }

    //访问的ip
    public static String getBaseUrl(){
        Properties prop = new Properties();
        String baseUrl = null;
        try {
            //读取url地址文件
            InputStream InputStream = new BufferedInputStream(new FileInputStream(new File("src\\test\\java\\com\\test\\datas\\baseUrl.properties")));
            prop.load(InputStream);
            baseUrl = prop.getProperty("baseUrl");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return baseUrl;
    }

    //设置浏览器属性
    public static ChromeOptions setChromeOption() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        return options;
    }
}
