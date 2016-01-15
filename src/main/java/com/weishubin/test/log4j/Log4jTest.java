package com.weishubin.test.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author weishubin
 */
public class Log4jTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Log4jTest.class);
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
    }
}
