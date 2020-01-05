package com.zzo.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * name:
 * desc: ；logback本身就是使用的slf4j
 * author:  zzo
 * date:    2020-01-05
 * version: 1.0
 */
public class SingleLogbackDemo {

    static Logger logger = LoggerFactory.getLogger(SingleLogbackDemo.class);

    public static void main(String[] args) {

        logger.info("hello{}","logback");
    }
}
