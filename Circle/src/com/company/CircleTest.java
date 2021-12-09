package com.company;

public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle("blue", 4.0 );
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        c1.setRadius(5);
        c1.setColor("red");
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}
