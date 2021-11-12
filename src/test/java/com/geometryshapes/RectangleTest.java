package com.geometryshapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void findAreaOfRectangle_WhenBothValuesArePresent() {
        assertEquals(15,Rectangle.findArea(3,5));
    }

    @Test
    public void findAreaOfRectangle_WhenLengthIsZero() {
        assertEquals(0,Rectangle.findArea(0,5));
    }

    @Test
    public void findAreaOfRectangle_WhenBreathIsZero() {
        assertEquals(0,Rectangle.findArea(3,0));
    }

    @Test
    public void findAreaOfRectangle_WhenBothValuesAreZero() {
        assertEquals(0,Rectangle.findArea(0,0));
    }

    @Test
    public void findAreaOfRectangle_WhenBothValuesAreSame() {
        assertEquals(25,Rectangle.findArea(5,5));
    }
}
