package ru.vstu.codingbat;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Test class for {@link MapMedium}
 */

public class MapMediumTests {

    MapMedium mapMedium = new MapMedium();

    @Test
    public void firstSwapTest() {
        String[] test1 = {"ab", "ac"};
        assertArrayEquals(new String[]{"ac", "ab"}, mapMedium.firstSwap(test1));

        String[] test2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] expected2 = {"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"};
        assertArrayEquals(expected2, mapMedium.firstSwap(test2));

        String[] test3 = {"i", "like", "our", "java", "thread!", "btw,", "orm", "is", "shit", "use", "jdbc"};
        String[]  exp3 = {"is", "like", "orm", "jdbc", "thread!", "btw,", "our", "i", "shit", "use", "java"};
        assertArrayEquals(exp3, mapMedium.firstSwap(test3));

        String[] test4 = {"easy", "does", "it", "every", "ice", "eaten"};
        String[]  exp4 = {"every", "does", "ice", "easy", "it", "eaten"};
        assertArrayEquals(exp4, mapMedium.firstSwap(test4));
    }

    @Test
    public void word0Test() {
        String[] input1 = {"a", "b", "a", "b"};
        Map<String, Integer> expected1 = Map.ofEntries(Map.entry("a", 0), Map.entry("b", 0));
        assertEquals(expected1, mapMedium.word0(input1));

        String[] input2 = {"a", "b", "a", "c", "b"};
        Map<String, Integer> expected2 = Map.ofEntries(
                Map.entry("a", 0), Map.entry("b", 0), Map.entry("c", 0)
        );
        assertEquals(expected2, mapMedium.word0(input2));

        String[] input3 = {"c", "b", "a"};
        Map<String, Integer> expected3 = Map.ofEntries(
                Map.entry("a", 0), Map.entry("b", 0), Map.entry("c", 0)
        );
        assertEquals(expected3, mapMedium.word0(input3));
    }

    @Test
    public void wordMultipleTest() {
        Map<String, Boolean> expected1 = Map.ofEntries(
                Map.entry("a", true), Map.entry("b", true), Map.entry("c", false)
        );
        assertEquals(expected1, mapMedium.wordMultiple(new String[] {"a", "b", "a", "c", "b"}));

        Map<String, Boolean> expected2 = Map.ofEntries(
                Map.entry("a", false), Map.entry("b", false), Map.entry("c", false)
        );
        assertEquals(expected2, mapMedium.wordMultiple(new String[] {"c", "b", "a"}));

        Map<String, Boolean> expected3 = Map.ofEntries(Map.entry("c", true));
        assertEquals(expected3, mapMedium.wordMultiple(new String[] {"c", "c", "c", "c"}));
    }
}
