package ru.socialquantum.testtasks;

public class SquareFactory {
    public SquareFactory() {
    }

    public static Square newSquare(double sideLength) {
        return new SquareI(sideLength);
    }
}
