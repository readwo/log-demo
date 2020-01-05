package com.zzo.logdemo;

import org.apache.log4j.Logger;

/**
 * name:
 * desc:    单纯使用log4j框架，不使用门面api
 * author:  zzo
 * date:    2020-01-05
 * version: 1.0
 */
public class SingleLog4jDemo {
    static Logger logger = Logger.getLogger(SingleLog4jDemo.class);

    public static void main(String[] args) {
        logger.debug("hello log4j");
    }
}
