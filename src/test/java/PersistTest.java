import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * created: User
 * date: 06.06.2019
 */
public class PersistTest {
    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(0, Persist.persistence(4));
        assertEquals(3, Persist.persistence(39));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }
}
