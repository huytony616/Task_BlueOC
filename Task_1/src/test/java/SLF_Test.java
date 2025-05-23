import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SLF_Test {

    @Test
    public void testTypicalCase() {
        String[] input = {"a", "ab", "abc", "cd", "def", "gh"};
        List<String> expected = Arrays.asList("ab", "cd", "gh");
        List<String> actual = SLF.result(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyInput() {
        String[] input = {};
        List<String> expected = Collections.emptyList();
        List<String> actual = SLF.result(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleLengthDominates() {
        String[] input = {"a", "bb", "cc", "dd"};
        List<String> expected = Arrays.asList("bb", "cc", "dd");
        List<String> actual = SLF.result(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testAllUniqueLengths() {
        String[] input = {"a", "ab", "abc", "abcd"};
        List<String> expected = Arrays.asList("a", "ab", "abc", "abcd");
        List<String> actual = SLF.result(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNullInput() {
        List<String> actual = SLF.result(null);
        assertEquals(Collections.emptyList(), actual);
    }
}
