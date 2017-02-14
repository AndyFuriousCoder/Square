package ru.socialquantum.testtasks;

/**
 *
 * @author Vladimir Bogodukhov
 *
 * {@link ru.socialquantum.testtasks.Square}
 **/
public interface Square {

    /**
     * @return длина стороны квадрата
     */
    double sideLength();


    /**
     * @return Площадь квадрата
     */
    double square();


    /**
     * Метод проверяющий равны ли квадраты по площадям
     *
     * @param square
     * @return true если равны (false если не равны)
     */
    boolean equalsSquare(Square square);

}