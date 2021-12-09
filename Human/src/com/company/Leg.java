package com.company;

public class Leg {

    private String color;
    private String length;
    private String hip;

    public Leg(String color, String length, String hip) {
        this.color = color;
        this.length = length;
        this.hip = hip;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getHip() {
        return hip;
    }

    public void setHip(String hip) {
        this.hip = hip;
    }

    public String toString() {
        return color + " " + length + " legs and " + hip + " hips";
    }

}
