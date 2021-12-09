package com.company;

public class Hand {

    private String color;
    private String size;
    private String shoulder;

    public Hand(String color, String size, String shoulder) {
        this.color = color;
        this.size = size;
        this.shoulder = shoulder;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getShoulder() {
        return shoulder;
    }

    public void setShoulder(String shoulder) {
        this.shoulder = shoulder;
    }

    public String toString() {
        return color + " " + size + " hands and " + shoulder + " shoulders";
    }

}
