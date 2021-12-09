package com.company;

public class Head {

    private String color;
    private String eyes;
    private String hair;
    private String ears;

    public Head(String color, String eyes, String hair, String ears) {
        this.color = color;
        this.eyes = eyes;
        this.hair = hair;
        this.ears = ears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getEars() {
        return ears;
    }

    public void setEars(String ears) {
        this.ears = ears;
    }

    public String toString() {
        return color + " face, " + hair + " hair, " + eyes + " eyes, and " + ears + " ears";
    }


}
