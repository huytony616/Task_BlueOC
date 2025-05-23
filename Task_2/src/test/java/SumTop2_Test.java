import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumTop2_Test {

    @Test
    public void testTypicalCase() {
        int[] input = {1, 4, 2, 3, 5};
        assertEquals(9, SumTop2.sumOfTopTwo(input));
    }

    @Test
    public void testTwoElements() {
        int[] input = {10, 9};
        assertEquals(19, SumTop2.sumOfTopTwo(input));
    }

    @Test
    public void testNegativeNumbers() {
        int[] input = {-1, -2, -3, -4};
        assertEquals(-3, SumTop2.sumOfTopTwo(input));  // -1 + -2
    }

    @Test
    public void testDuplicateMaxValues() {
        int[] input = {100, 100, 50, 50};
        assertEquals(10, SumTop2.sumOfTopTwo(input));
    }

    @Test
    public void testLargeNumbers() {
        int[] input = {1000, 9999999, 12345, 2345};
        assertEquals(10001244, SumTop2.sumOfTopTwo(input));
    }

    @Test
    public void testExceptionOnShortInput() {
        int[] input = {42};
        assertThrows(IllegalArgumentException.class, () -> {
        	SumTop2.sumOfTopTwo(input);
        });
    }

    @Test
    public void testExceptionOnNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
        	SumTop2.sumOfTopTwo(null);
        });
    }
}
