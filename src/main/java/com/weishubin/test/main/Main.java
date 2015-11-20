package com.weishubin.test.main;

import com.weishubin.test.mapper.SampleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jca.context.ResourceAdapterApplicationContext;

/**
 * Created by Administrator on 2015/11/20.
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SampleMapper sampleMapper = context.getBean(SampleMapper.class);
        String s = sampleMapper.getMySQLVersion();
        logger.info(s);
    }
}
