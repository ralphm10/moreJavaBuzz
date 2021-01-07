import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaBuzzTest {

    @Test
    public void returnsNumber() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.checkNumber(1);
        assertEquals("1", result);
    }

    @Test
    public void returnsFizzIfDivisibleByThree() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.checkNumber(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void returnsBuzzIfDivisibleByFive() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.checkNumber(5);
        assertEquals("Buzz", result);
    }
}
