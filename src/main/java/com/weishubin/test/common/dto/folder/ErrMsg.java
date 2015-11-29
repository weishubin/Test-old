package com.weishubin.test.common.dto.folder;

/**
 * Created by weishubin on 15/11/28.
 */
public class ErrMsg {
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private int code;
    private String provider;
    private String desc;
}
