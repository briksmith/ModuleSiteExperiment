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
