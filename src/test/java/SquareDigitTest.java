import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * created: User
 * date: 25.06.2019
 */
public class SquareDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
    }
}
