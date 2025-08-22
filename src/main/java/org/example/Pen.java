package org.example;

public class Pen implements Writer {
    private String color;
    private int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public void writing() {
        System.out.println(" I am Writing via Pen ");

    }
}