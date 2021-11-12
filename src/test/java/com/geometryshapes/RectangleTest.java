package com.geometryshapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {

    @Test
    public void findAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(3,5);
        assertEquals(15,rectangle.area());
    }

    @Test
    public void findPerimeterOfRectangle(){
        Rectangle rectangle = new Rectangle(3,5);
        double expectedResult = 2 * (3 + 5);
        assertEquals(expectedResult,rectangle.perimeter());

    }
}
