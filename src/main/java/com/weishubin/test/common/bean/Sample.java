package com.weishubin.test.common.bean;

import java.util.Date;

/**
 * Created by weishubin on 15/11/21.
 */
public class Sample {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Integer id;
    private Date date;

}
