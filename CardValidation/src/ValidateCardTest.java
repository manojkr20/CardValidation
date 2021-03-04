import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateCardTest {

    private ValidateCard card;

    @BeforeEach
    public void setup() {
        card = new ValidateCard();
    }

    @Test
    @DisplayName("Check simple card number")
    public void checkLuhn() {
        assertTrue(card.CheckLuhn("379354508162306"));
        assertTrue(card.CheckLuhn("012850003580200"));
        assertTrue(card.CheckLuhn("799273987130000"));

        assertFalse(card.CheckLuhn("abcdefghijklmn"));
        assertFalse(card.CheckLuhn("huuhfwefwdffrf"));

        assertFalse(card.CheckLuhn("4388576018402626"));
        assertFalse(card.CheckLuhn("5422487897664844"));
        assertFalse(card.CheckLuhn("5458751246498754"));
    }
}