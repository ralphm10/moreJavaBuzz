import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaBuzzTest {

    @Test
    public void returnsNumber() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.checkNumber(1);
        assertEquals(result, "1");
    }
}
