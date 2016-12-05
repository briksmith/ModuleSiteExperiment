import spock.lang.Specification
import spock.lang.Unroll
/**
 * Created by Brian Smith on 12/1/2016.
 */

class TestEqualsMethod extends Specification {

    def "checkEqualsMethod" (ComplexNumber i, ComplexNumber j, boolean result) {

        expect:

        assert i.equals(j) == result : "i: " + i.toString() + "\n" +
                "j: " + j.toString() + "\n" +
                " i equals j should have been: " + result
        where:
        i << [new ComplexNumber(2, 2), new ComplexNumber(2, 2), new ComplexNumber(2, 2), new ComplexNumber(2, 2) ]
        j << [new ComplexNumber(2, 2), new ComplexNumber(2, 3), new ComplexNumber(3, 2), new ComplexNumber(3, 3) ]
        result << [true, false, false, false]
    }
}

class TestNoArgsComplexConstructor extends Specification {
    def i = new ComplexNumber()

    def "checkNoArgsConstructor"() {
        expect:
        assert i.getReal() == 0: "The constructor should have set the real component of the number to 0.  Instead it was: " + i.getReal()
        assert i.getImaginary() == 0: "The constructor should have set the imaginary component of the number to 0.  Instead it was: " + i.getImaginary()
    }
}

class TestConstructorOfComplexNumbers extends Specification {

    def i = new ComplexNumber(1.0, 3.0)

    def "checkConstructor"() {
        expect:
        assert i.getReal() == 1: "The constructor should have set the real component of the number to 1 and it set it to " + i.getReal()
        assert i.getImaginary() == 3: "The constructor should have set the imaginary component of the number to 3 and it set it to " + i.getImaginary()
    }
}

class TestCopyConstructorOfComplexNumbers extends Specification {

    def i = new ComplexNumber(2, 6)
    def j = new ComplexNumber(i)

    def "checkCopyConstructor"() {
        expect:
        assert j.equals(i): "The copy constructor should have created an identical object.  The object j " + j.toString() +
                " should have been meaningfully equal to i " + i.toString()
    }
}

class TestCopyConstructorForDefensiveCopying extends Specification {
    final def real = 2
    final def imaginary = 6
    def i = new ComplexNumber(real, imaginary)
    ComplexNumber j = new ComplexNumber(i)
    def "checkForDefensiveCopying" () {
        j.setReal(3)
        j.setImaginary(12)
        expect:
            i.getReal() == real
            i.getImaginary() == imaginary

    }

}

class TestAddToComplexNumber extends Specification {

    ComplexNumber i = new ComplexNumber(2, 4)
    ComplexNumber j = new ComplexNumber(4, 9)

    def "checkAddToComplexNumber"() {
        i.addToComplex(j)
        expect:
        assert i.getReal() == 6: "The add to complex number routine should have set the real component to 6 and set it to " + i.getReal();
        assert i.getImaginary() == 13: "The add to complex number routine should have set the imaginary component to 13 and set it to " + i.getImaginary();
    }
}

class TestReturnSumOfComplexNumber extends Specification {

    ComplexNumber i = new ComplexNumber(3, 6)
    ComplexNumber j = new ComplexNumber(4, 12)

    def "checkReturnSumOfComplexNumber"() {
        ComplexNumber checkSum = ComplexNumber.returnSumOfComplexNumbers(i, j)
        expect:
        assert checkSum.getReal() == 7: "The return sumOfComplexNumbers method should have returned a complex number with 7 as its real component.  Was: " + checkSum.getReal()
        assert checkSum.getImaginary() == 18: "The return sumOfComplexNumbers method should have returned a complex number with 18 as its imaginary component.  Was: " + checkSum.getImaginary()
    }
}