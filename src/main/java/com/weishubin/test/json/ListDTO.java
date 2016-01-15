package com.weishubin.test.json;

import java.util.List;

/**
 * @author weishubin
 */
public class ListDTO<T> {
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
