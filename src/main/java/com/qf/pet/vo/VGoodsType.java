package com.qf.pet.vo;

//绑定界面信息

import java.util.List;

public class VGoodsType {
    private Integer pid;
    private String pname;
    private String imgUrl;
    //子类型vo类
    private List<VGoodsType> clist;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<VGoodsType> getClist() {
        return clist;
    }

    public void setClist(List<VGoodsType> clist) {
        this.clist = clist;
    }
}
