package com.geometryshapes;

public class Rectangle {

    double length;
    double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area() {
        double area = this.length * this.breadth ;
        return  area;
    }
}
