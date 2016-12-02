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