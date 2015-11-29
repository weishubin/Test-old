package com.weishubin.test.common.dto.folder;

import org.springframework.beans.factory.annotation.Required;

import javax.validation.constraints.NotNull;

/**
 * 创建专辑时的请求对象
 */
public class FolderReqDTO {
    @NotNull
    private Integer uid;
    private String title;
    private Integer cateid;
    private String ip;
    private String description;
    private String tags;
    private String flags;
    private Integer flagsInt;
    private String caller;
    private String wkey;
    private String reltype;
    private String relid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public Integer getFlagsInt() {
        return flagsInt;
    }

    public void setFlagsInt(Integer flagsInt) {
        this.flagsInt = flagsInt;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getWkey() {
        return wkey;
    }

    public void setWkey(String wkey) {
        this.wkey = wkey;
    }

    public String getReltype() {
        return reltype;
    }

    public void setReltype(String reltype) {
        this.reltype = reltype;
    }

    public String getRelid() {
        return relid;
    }

    public void setRelid(String relid) {
        this.relid = relid;
    }

}
