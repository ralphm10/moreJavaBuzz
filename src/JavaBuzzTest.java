import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaBuzzTest {

    private JavaBuzz underTest;

    @Before
    public void setUp() {
        underTest = new JavaBuzz();
    }

    @Test
    public void returnsNumber() {
        String result = underTest.checkNumber(1);
        assertEquals("1", result);
    }

    @Test
    public void returnsFizzIfDivisibleByThree() {
        String result = underTest.checkNumber(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void returnsBuzzIfDivisibleByFive() {
        String result = underTest.checkNumber(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void returnsFizzBuzzIfDivisibleByFiveAndThree() {
        String result = underTest.checkNumber(15);
        assertEquals("FizzBuzz", result);
    }
}
