package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    void testGHappyAtTheMiddle(){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxggxx");

        Assertions.assertEquals(true, result);
    }

    @Test
    void testGHappyAtTheStart(){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("ggxxttt");

        Assertions.assertEquals(true, result);
    }

    @Test
    void testGHappyAtTheEnd(){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxsxxxgg");

        Assertions.assertEquals(true, result);
    }


    @Test
    void testGHappyNotMatch(){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxxgaxxgxgxgxg");

        Assertions.assertEquals(false, result);
    }
}
