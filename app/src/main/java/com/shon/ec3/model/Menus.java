package com.shon.ec3.model;

public class Menus {
    private String imgUrl;
    private String name;

    public Menus(String imgUrl, String name) {
        this.imgUrl =imgUrl;
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
