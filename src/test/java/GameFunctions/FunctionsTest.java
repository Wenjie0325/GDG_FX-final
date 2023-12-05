package GameFunctions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

    @Test
    void diceRoll() {
        Functions fc = new Functions();
        int roll_num = fc.DiceRoll();
        assertNotNull(roll_num);
    }
}