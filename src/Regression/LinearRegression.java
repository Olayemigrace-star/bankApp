package Regression;

public class LinearRegression {
//    private double meanOfX;
//    private double meanOfY;
//    private double averageX;
//    private double[] arrayMeanDiff;
//    private double sum;
//    private int counter = 0;
//
//    public double[] getArrayMeanDiffOfX() {
//    }

    public double averageOfX(double[] numbers) {
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count];
        }
        double meanOfX = (double)(Math.round((sum / numbers.length) * 100)) / 100;
        return meanOfX;
    }

    public double averageOfY(double[] number) {
        int sum = 0;
        for (int count = 0; count < number.length; count++){
            sum += number[count];
        }
        double meanOfY = (double)(Math.round((sum / number.length) * 100)) / 100;
        return meanOfY;
    }


    public double [] differenceAndMeanOfX(double[] numbers) {
        double xmean = averageOfX(numbers);
        double[] arrayMeanDiffOfX = new double[numbers.length];

        for (int count = 0; count < numbers.length; count++){
            arrayMeanDiffOfX[count] =  (double) Math.round((numbers[count] - xmean) * 100) / 100;

        }
        return arrayMeanDiffOfX;
    }
    public double [] differenceAndMeanOfY(double[] numbers) {
        double ymean = averageOfY(numbers);
        double[] arrayMeanDiffOfY = new double[numbers.length];

        for (int count = 0; count < numbers.length; count++){
            arrayMeanDiffOfY[count] =  (double) Math.round((numbers[count] - ymean) * 100) / 100;

        }
        return arrayMeanDiffOfY;
    }

    public double sumOfMeanDiffSquareX(double[] numbers) {
        double [] meanSquareX = new double[numbers.length];
        double add = 0;
        double[] difference = differenceAndMeanOfX(numbers);
        for (int count = 0; count < numbers.length; count++) {
            meanSquareX[count] =  difference[count] * difference[count];
            add += meanSquareX[count];
        }
        return add;
    }

    public double productSumOfMeanXMeanY(double[] xNumbers, double[] yNumbers) {
        double[] meanDiffOfX = differenceAndMeanOfX(xNumbers);
        double [] meanDiffOfY = differenceAndMeanOfY(yNumbers);

        double [] productDiffXY = new double[xNumbers.length];
        double sum = 0;
        for (int count = 0; count < xNumbers.length; count++) {
            productDiffXY[count] = meanDiffOfX[count] * meanDiffOfY[count];
            sum += productDiffXY[count];
        }

        return sum;
    }

    public double resultOfBetaOne(double[] xNumbers, double[] yNumbers) {
         double product = productSumOfMeanXMeanY(xNumbers, yNumbers);
         double sum = sumOfMeanDiffSquareX(xNumbers);
         double beta = (double) Math.round((product / sum) * 10000) / 10000;

        return beta;
        }


    public double resultOfBetaNought(double[] xNumber, double[] yNumber) {
        double meanY = averageOfY(yNumber);
        double meanX = averageOfX(xNumber);
       double betaOne = resultOfBetaOne(xNumber, yNumber);
        double betaNought = (double) Math.round(((meanY) - (betaOne * meanX)) * 10000) / 10000;
       return betaNought;
    }
}

