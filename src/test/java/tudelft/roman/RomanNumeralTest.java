package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        System.out.print("This method is called before each test!\n");
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {

        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithSubtractiveNotationRandom1() {
        int result = roman.convert("VX");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void numberWithSubtractiveNotationRandom2() {
        int result = roman.convert("XXC");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
}
