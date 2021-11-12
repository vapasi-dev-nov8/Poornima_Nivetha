package com.geometryshapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void findAreaOfSquare() {
        Square square = new Square(4.0);
        double expectedResult = 2 * 4.0;
        assertEquals(expectedResult,square.area());
    }


    @Test
    public void findPerimeterOfSquare() {
        Square square = new Square(4.0);
        double expectedResult = 4 * 4.0;
        assertEquals(expectedResult,square.perimeter());
    }
}
