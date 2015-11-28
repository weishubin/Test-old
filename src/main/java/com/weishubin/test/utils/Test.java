package com.weishubin.test.utils;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by weishubin on 15/11/21.
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Sample sample = new Sample();

        Integer a = (Integer) PropertyUtils.getProperty(sample, "age");
        System.out.println(a);

        PropertyUtils.setProperty(sample, "age", "10");

        a = (Integer) PropertyUtils.getProperty(sample, "age");
        System.out.print(a);

    }
}
