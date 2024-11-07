package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BaseTest {

    @Test
    void validPriceEqualTest(){
        var cheeseburger = new Base(13.99);
        assertEquals(13.99, cheeseburger.getPrice());
    }

    @Test
    void validPriceUnequalTest(){
        var baconburger = new Base(15.99);
        assertNotEquals(13.99, baconburger.getPrice());
    }

    @Test
    void invalidPriceTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Base(-5.0);});
    }
}
