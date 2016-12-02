/**
 * Created by Brian Smith on 12/1/2016.
 */
public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double inReal, double inImaginary){

        real = inReal;
        imaginary = inImaginary;
    }

    public void addToComplex(ComplexNumber inComplexNumber){

        this.real += inComplexNumber.real;
        this.imaginary += inComplexNumber.imaginary;
    }

    public static ComplexNumber returnSumOfComplexNumbers(ComplexNumber num1, ComplexNumber num2){

        double newRealComponent = getNewRealComponent(num1, num2);
        double newImaginaryComponent = getNewImaginaryComponent(num1, num2);
        return new ComplexNumber(newRealComponent, newImaginaryComponent);
    }

    private static double getNewRealComponent(ComplexNumber num1, ComplexNumber num2) {
        return num1.getReal() + num2.getReal();
    }

    private static double getNewImaginaryComponent(ComplexNumber num1, ComplexNumber num2) {
        return num1.getImaginary() + num2.getImaginary();
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
}
