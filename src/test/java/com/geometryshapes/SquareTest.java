package com.geometryshapes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @ParameterizedTest
    @MethodSource("provideSideAndArea")
    public void findAreaOfSquare(double side, double expectedArea) {
        Square square = new Square(side);
        double actualArea = square.area();
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideSideAndArea() {
        return Stream.of(
                Arguments.of(2.0, 4.0),
                Arguments.of(0.0, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSideAndPerimeter")
    public void findPerimeterOfSquare(double side, double expectedArea) {
        Square square = new Square(side);
        double actualArea = square.perimeter();
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideSideAndPerimeter() {
        return Stream.of(
                Arguments.of(2.0, 8.0),
                Arguments.of(0.0, 0.0)
        );
    }
}
