package com.weishubin.test.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author weishubin
 */
public interface SampleMapper {

    @Select("select version()")
    public String getMySQLVersion();
}
