package com.example.cateringsystem;

public class model {

    String name,category,purl;

    public model(String name, String category, String purl) {
        this.name = name;
        this.category = category;
        this.purl = purl;
    }

    public model(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
