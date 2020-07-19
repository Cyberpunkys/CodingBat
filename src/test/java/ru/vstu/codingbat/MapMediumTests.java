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
    void firstSwapTest() {
        String[] test1 = {"ab", "ac"};
        assertArrayEquals(new String[]{"ac", "ab"}, mapMedium.firstSwap(test1));

        String[]     test2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] expected2 = {"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"};
        assertArrayEquals(expected2, mapMedium.firstSwap(test2));

        String[] test4 = {"easy", "does", "it", "every", "ice", "eaten"};
        String[]  exp4 = {"every", "does", "ice", "easy", "it", "eaten"};
        assertArrayEquals(exp4, mapMedium.firstSwap(test4));
    }

    @Test
    void word0Test() {
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
    void wordMultipleTest() {
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

    @Test
    void allSwap() {
        assertArrayEquals(new String[] {"ac", "ab"}, mapMedium.allSwap(new String[] {"ab", "ac"}));

        String[]     test2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] expected2 = {"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"};
        assertArrayEquals(expected2, mapMedium.allSwap(test2));

        String[]   test3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        String[] expect3 = {"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"};
        assertArrayEquals(expect3, mapMedium.allSwap(test3));
    }
}
