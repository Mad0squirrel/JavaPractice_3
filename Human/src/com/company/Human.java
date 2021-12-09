package com.company;

public class Human {

    public static void main(String[] args) {
	Hand AnnHands = new Hand("white", "small", "slim");
    Leg AnnLegs = new Leg("white", "short", "wide");
    Head AnnFace = new Head("white", "green", "blonde", "pointed");
    System.out.println("Ann has:");
    System.out.println(AnnFace);
    System.out.println(AnnHands);
    System.out.println((AnnLegs));
    }
}
