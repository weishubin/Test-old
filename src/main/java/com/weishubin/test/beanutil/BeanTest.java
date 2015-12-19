package com.weishubin.test.beanutil;

import com.weishubin.test.common.bean.Sample;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.springframework.cglib.beans.BeanCopier;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 设置Bean的属性
 * 涉资单个属性
 * 将Map转换为Bean
 * value可以是String
 *
 * @author weishubin
 */
public class BeanTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        init();

        Sample s = new Sample();
        //设置Bean的单个属性
        BeanUtils.setProperty(s,"id", "12345678901234567890");
        System.out.println(s.getId());

        //支持Date类型，需要注册DateConverter
        BeanUtils.setProperty(s, "date", "2014-12-01");
        System.out.println(s.getDate());

        //将Map转换为Bean
        Sample s2 = new Sample();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", "456a");
        map.put("date", "2015-06-06");
        BeanUtils.populate(s2, map);
        System.out.println(s2.getId());

    }

    private static void init() {
        //初始化日志转换器
        DateConverter dateConverter = new DateConverter();
        dateConverter.setUseLocaleFormat(true);
        dateConverter.setPattern("yyyy-MM-dd");
        BeanUtilsBean.getInstance().getConvertUtils().register(dateConverter, Date.class);

        //初始化Integer转换器,不设置默认值
        IntegerConverter integerConverter = new IntegerConverter();
        BeanUtilsBean.getInstance().getConvertUtils().register(integerConverter, Integer.class);
    }
}
