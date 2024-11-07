package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoyaltyStatusTest {

    @Test
    void validMemberStatusTest() {
        var memberStatus = new LoyaltyStatus("member");
        assertEquals(0.9, memberStatus.discountPercentage());
    }

    @Test
    void validPremiumStatusTest() {
        var premiumStatus = new LoyaltyStatus("premium");
        assertEquals(0.75, premiumStatus.discountPercentage());
    }

    @Test
    void validRegularStatusTest() {
        var regularStatus = new LoyaltyStatus("regular");
        assertEquals(1.0, regularStatus.discountPercentage());
    }

    @Test
    void invalidStatusTest() {
        assertThrows(IllegalArgumentException.class, () -> {new LoyaltyStatus("vip");});
    }
}