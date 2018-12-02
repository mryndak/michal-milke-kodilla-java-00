package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;
    private String name;

    public Square(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(){
        return a*a;
    }
    public String toString(){
        return name + " " + " field " +  getField();
    }
}
