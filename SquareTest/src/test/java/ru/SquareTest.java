package ru;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.socialquantum.testtasks.Square;
import ru.socialquantum.testtasks.SquareFactory;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SquareTest{

    private Square testSquare;

    public SquareTest(double sideLengthParameter)
    {
        this.testSquare = SquareFactory.newSquare(sideLengthParameter);
    }

    // Тест 1: проверка метода sideLength()
    @Test
    public void sideLengthMethodTest()
    {
        double sideLength = testSquare.sideLength();
        assertNotNull("Element not exist!", sideLength);
        assertTrue("Wrong side length!",sideLength>0);
    }

    //Тест 2: проверка метода square()
    @Test
    public void squareMethodTest()
    {
        double square = testSquare.square();
        assertNotNull("Element not exist!",square);
        assertTrue("Wrong square value!",square>0);
    }

    //Тест 3: проверка метода equalsSquare()
    @Test
    public void equalsSquareMethodTest()
    {
        boolean statementTrue = testSquare.equalsSquare(testSquare);
        boolean statementFalse = testSquare.equalsSquare(SquareFactory.newSquare(99.10));
        assertNotNull("Element not exist!",statementTrue);
        assertTrue("Elements are not equals!",statementTrue);
        assertNotNull("Element not exist!",statementFalse);
        assertTrue("Different elements are equals!",!statementFalse);
    }

    //Набор параметров для тестов (стороны квадрата)
    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {0.10},
                {10.10},
                {20.10},
                {30.10}});
    }
}
