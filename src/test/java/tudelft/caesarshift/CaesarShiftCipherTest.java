package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    void ceaserCipher3Shift(){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher("abcx",3);
        Assertions.assertEquals("defa",result);

    }

    @Test
    void ceaserCipherNoShift(){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher("abc x",0);
        Assertions.assertEquals("abc x",result);

    }

    @Test
    void ceaserCipher3ShiftWithUnknownChars(){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher("abc x $%^&",0);
        Assertions.assertEquals("invalid",result);

    }
}
