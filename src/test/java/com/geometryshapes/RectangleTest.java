package com.geometryshapes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {

    @ParameterizedTest
    @MethodSource("provideLengthBreadthAndArea")
    public void findAreaOfRectangle(double length, double breadth, double expectedArea) {
        Rectangle rectangle = new Rectangle(length,breadth);
        double actualArea = rectangle.area();
        assertEquals(expectedArea,actualArea);
    }

    private static Stream<Arguments> provideLengthBreadthAndArea() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 6.0),
                Arguments.of(2.0, 0.0, 0.0),
                Arguments.of(0.0, 3.0, 0.0),
                Arguments.of(0.0, 0.0, 0.0),
                Arguments.of(3.0, 3.0, 9.0)
        );
    }

    @Test
    public void findPerimeterOfRectangle(){
        Rectangle rectangle = new Rectangle(3,5);
        double expectedResult = 2 * (3 + 5);
        assertEquals(expectedResult,rectangle.perimeter());

    }
}
