package com.geometryshapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {
    Rectangle rectangle = new Rectangle();

    @Test
    public void findAreaOfRectangle_WhenBothValuesArePresent() {
        rectangle.setLength(3);
        rectangle.setBreadth(5);
        assertEquals(15,rectangle.area());
    }
}
