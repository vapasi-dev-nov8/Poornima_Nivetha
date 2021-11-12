package com.geometryshapes;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return 2 * this.side;
    }

    public double perimeter() {
        return 4 * this.side;
    }
}
