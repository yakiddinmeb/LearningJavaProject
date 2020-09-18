package learningjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {
    // This is an example of a unit test that passes.
    @Test
    public void samplePassingTest() {
        assertEquals("apples", "apples");
    }

    // This is an example of a unit test that fails.
    @Test
    public void sampleFailingTest() {
        assertEquals("apples", "oranges");
    }
}
