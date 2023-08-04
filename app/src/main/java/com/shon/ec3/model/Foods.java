package com.shon.ec3.model;

public class Foods extends Menus {
    private String little_description;

    public Foods(String imgUrl, String name, String little_description) {
        super(imgUrl, name);
        this.little_description = little_description;
    }

    public String getLittle_description() {
        return little_description;
    }

    public void setLittle_description(String little_description) {
        this.little_description = little_description;
    }
}
