package com.zzo.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * name:
 * desc:  使用slf4j-log4j12,
 *        与log4j联合使用，用于使当前项目的log4j实现slf标准
 * author:  zzo
 * date:    2020-01-05
 * version: 1.0
 */
public class Slf4jLog4JImpl {

     static final Logger logger = LoggerFactory.getLogger(SingleLog4jDemo.class);

     public static void main(String[] args) {
          logger.info("hello,{},{}","slf4j","log4jImpl");
     }

}
