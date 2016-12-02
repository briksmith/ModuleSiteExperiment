import spock.lang.Specification

/**
 * Created by Brian Smith on 12/1/2016.
 */

class TestConstructorOfComplexNumbers extends Specification {

    def i = new ComplexNumber(1,3)

    def "constructorCheck"() {
        expect: assert i.getReal() == 1 :  "The constructor should have set the real component of the number to 1 and it set it to " + i.getReal()
            assert i.getImaginary() == 3 : "The constructor should have set the imaginary component of the number to 3 and it set it to " + i.getImaginary()
    }
}

class TestAddToComplexNumber extends Specification {

    ComplexNumber i = new ComplexNumber(2,4)
    ComplexNumber j = new ComplexNumber(4,9)

    def "addToComplexNumberCheck" () {
        i.addToComplex(j)
        expect:
            assert i.getReal() == 6 : "The add to complex number routine should have set the real component to 6 and set it to " + i.getReal();
            assert i.getImaginary() == 13 : "The add to complex number routine should have set the imaginary component to 13 and set it to " + i.getImaginary();
    }

}