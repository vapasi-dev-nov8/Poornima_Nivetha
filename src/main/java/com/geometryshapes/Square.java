package com.geometryshapes;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    /*
     * Method calculates the area
     *
     * */
    public double area() {
        return this.side * this.side;
    }

    /*
     * Method calculates the perimeter
     *
     * */
    public double perimeter() {
        return 4 * this.side;
    }
}
