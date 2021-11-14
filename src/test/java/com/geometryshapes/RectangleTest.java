package com.geometryshapes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Contains test cases for Rectangle
 *
 * */
public class RectangleTest {

    @ParameterizedTest
    @MethodSource("provideLengthBreadthAndArea")
    public void findAreaOfRectangle(double length, double breadth, double expectedArea) {
        Rectangle rectangle = new Rectangle(length, breadth);
        double actualArea = rectangle.area();
        assertEquals(expectedArea, actualArea);
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

    @ParameterizedTest
    @MethodSource("provideLengthBreadthAndPerimeter")
    public void findPerimeterOfRectangle(double length, double breadth, double expectedPerimeter) {
        Rectangle rectangle = new Rectangle(length, breadth);
        double actualPerimeter = rectangle.perimeter();
        assertEquals(expectedPerimeter, actualPerimeter);

    }

    private static Stream<Arguments> provideLengthBreadthAndPerimeter() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 10.0),
                Arguments.of(2.0, 0.0, 4.0),
                Arguments.of(0.0, 3.0, 6.0),
                Arguments.of(0.0, 0.0, 0.0),
                Arguments.of(3.0, 3.0, 12.0)
        );
    }
}
