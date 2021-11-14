package com.geometryshapes;

public class Rectangle {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    /*
    * Method calculates the area
    *
    * */
    public double area() {
        return this.length * this.breadth;
    }

    /*
     * Method calculates the perimeter
     *
     * */
    public double perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
