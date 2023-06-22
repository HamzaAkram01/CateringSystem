package com.example.cateringsystem;


public class tableModel {

    String sno,price,quantity,amount;
    String name;

    public tableModel(String sno, String price, String quantity, String name, String amount) {
        this.sno = sno;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.amount = amount;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}