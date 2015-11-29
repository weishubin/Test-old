package com.weishubin.test.common.dto.folder;

/**
 * 专辑返回对象.
 */
public class FolderRespDTO {
    private Double cost;
    private Integer id;
    private ErrMsg e;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ErrMsg getE() {
        return e;
    }

    public void setE(ErrMsg e) {
        this.e = e;
    }

}
