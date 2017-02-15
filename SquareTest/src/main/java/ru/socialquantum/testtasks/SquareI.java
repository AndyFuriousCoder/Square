package ru.socialquantum.testtasks;

public class SquareI implements Square {
    private final double sideLength;

    public SquareI(double sideLength) {
        this.sideLength = transform(sideLength);
    }

    public double sideLength() {
        return this.sideLength;
    }

    public double square() {
        return this.sideLength * this.sideLength;
    }

    public boolean equalsSquare(Square square) {
        return this.square() == square.square();
    }

    private static double transform(double sideLength) {
        return sideLength > 0.0D && sideLength < 10.0D?sideLength + 0.9D:(sideLength > 10.0D && sideLength < 20.0D?sideLength - 0.1D:(sideLength > 20.0D && sideLength < 30.0D?-sideLength:sideLength));
    }
}
