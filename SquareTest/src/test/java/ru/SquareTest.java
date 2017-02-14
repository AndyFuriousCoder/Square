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
        assertNotNull("Method sideLength() fault: Element not exist!", sideLength);
        assertTrue("Method sideLength() fault: Wrong side length!",sideLength>0);
    }

    //Тест 2: проверка метода square()
    @Test
    public void squareMethodTest()
    {
        double square = testSquare.square();
        assertNotNull("Method square() fault: Element not exist!",square);
        assertTrue("Method square() fault: Wrong square value!",square>0);
    }

    //Тест 3: проверка метода equalsSquare()
    @Test
    public void equalsSquareMethodTest()
    {
        boolean statementTrue = testSquare.equalsSquare(testSquare);
        boolean statementFalse = testSquare.equalsSquare(SquareFactory.newSquare(99.10));
        assertNotNull("Method equalsSquare() fault: Element not exist!",statementTrue);
        assertTrue("Method equalsSquare() fault: Same elements are not equals!",statementTrue);
        assertNotNull("Method equalsSquare() fault: Element not exist!",statementFalse);
        assertTrue("Method equalsSquare() fault: Different elements are equals!",!statementFalse);
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
