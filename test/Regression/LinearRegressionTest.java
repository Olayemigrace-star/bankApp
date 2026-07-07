package Regression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearRegressionTest {

    @Test
    public void averageOfNumbers_X_IsReturnedTest(){
        LinearRegression regression = new LinearRegression();
        double[] number = {28.00, 22.00, 15.00, 15.00, 20.00};
        assertEquals(20.00, regression.averageOfX(number));

    }
    @Test
    public void averageOfNumbers_Y_IsReturnedTest(){
        LinearRegression regression = new LinearRegression();
        double[] number = {5.00, 7.00, 6.00, 5.00, 7.00};
        assertEquals(6.00, regression.averageOfY(number));

    }
    @Test
    public void valueminus_averageXOfNumbersIsReturnedTest(){
        LinearRegression regression = new LinearRegression();
        double[] number = {28.00, 22.00, 15.00, 15.00, 20.00};
        double[] expected = {8.00, 2.00, -5.00, -5.00, 0.00};
        assertArrayEquals(expected, regression.differenceAndMeanOfX(number));
    }

    @Test
    public void valueminus_averageYOfNumbersIsReturnedTest(){
        LinearRegression regression = new LinearRegression();
        double[] number = {5.00, 7.00, 6.00, 5.00, 7.00};
        double[] expected = {-1.00, 1.00, 0.00, -1.00, 1.00};
        assertArrayEquals(expected, regression.differenceAndMeanOfY(number));
    }
    @Test
    public void valueMinus_averageXOfNumberSquaredIsReturnedTest(){
        LinearRegression regression = new LinearRegression();
        double[] number = {28.00, 22.00, 15.00, 15.00, 20.00};
        double expected = 118;
        assertEquals(expected, regression.sumOfMeanDiffSquareX(number));
    }

    @Test
    public void resultOfBetaOneTest(){
        LinearRegression regression = new LinearRegression();
        double[] xNumber = {28.00, 22.00, 15.00, 15.00, 20.00};
        double[] yNumber = {5.00, 7.00, 6.00, 5.00, 7.00};
        assertEquals(-0.0085, regression.resultOfBetaOne(xNumber, yNumber));
    }

    @Test
    public void resultOfBetaNoughtTest(){
        LinearRegression regression = new LinearRegression();
        double[] xNumber = {28.00, 22.00, 15.00, 15.00, 20.00};
        double[] yNumber = {5.00, 7.00, 6.00, 5.00, 7.00};
        assertEquals(6.1700, regression.resultOfBetaNought(xNumber, yNumber));
    }




}
