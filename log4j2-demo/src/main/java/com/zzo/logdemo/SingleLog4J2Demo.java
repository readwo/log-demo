package com.zzo.logdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * name:
 * desc:  单纯使用log4j2日志框架
 * author:  zzo
 * date:    2020-01-05
 * version: 1.0
 */
public class SingleLog4J2Demo {

    static Logger logger = LogManager.getLogger(SingleLog4J2Demo.class);

    public static void main(String[] args) {
        logger.info("hello log4j2");
    }
}
