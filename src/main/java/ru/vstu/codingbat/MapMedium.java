package ru.vstu.codingbat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapMedium {

    /**
     *  Given an array of non-empty strings, return a Map<String, String> with a key for every different first
     *  character seen, with the value of all the strings starting with that character appended together in the order
     *  they appear in the array.
     */
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();
        for (String str : strings) {
            String key = String.valueOf(str.charAt(0));
            if (resultMap.containsKey(key)) {
                resultMap.put(key, resultMap.getOrDefault(key, "") + str);
            } else {
                resultMap.put(key, str);
            }
        }
        return resultMap;
    }

    /**
     *  The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for
     *  each different string, with the value the number of times that string appears in the array.
     */
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }

    /**
     *  Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add
     *  its first character as a key with its last character as the value.
     */
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String first = String.valueOf(str.charAt(0));
            String last = String.valueOf(str.charAt(str.length() - 1));
            map.put(first, last);
        }
        return map;
    }

    /**
     *  We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then
     *  return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
     *  swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a
     *  swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More
     *  difficult than it looks.
     */
    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> swapIndexMap = new HashMap<>(); //value - index of string to swap. -1 - no swap indicator
        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);
            if (swapIndexMap.containsKey(firstChar)) {
                int indexSwap = swapIndexMap.get(firstChar);
                if (indexSwap != -1) {
                    String tmp = strings[i];
                    strings[i] = strings[indexSwap];
                    strings[indexSwap] = tmp;
                    swapIndexMap.put(firstChar, -1);
                }
            } else {
                swapIndexMap.put(firstChar, i);
            }
        }

        return strings;
    }

    /**
     *  Given an array of strings, return a Map<String, Integer> containing a key for every different string in the
     *  array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more
     *  complicated counting later, but for this problem the value is simply 0.
     */
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, 0);
        }
        return map;
    }

    /**
     *  Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is
     *  true if that string appears 2 or more times in the array.
     */
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, map.containsKey(str));
        }
        return map;
    }

    /**
     *  Given an array of strings, return a Map<String, Integer> containing a key for every different string in the
     *  array, and the value is that string's length.
     */
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, str.length());
        }
        return map;
    }

    /**
     *  We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then
     *  return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
     *  swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything.
     *  Using a map, this can be solved making just one pass over the array. More difficult than it looks.
     */
    public String[] allSwap(String[] strings) {
        Map<Character, Integer> swapMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);
            if (swapMap.containsKey(firstChar)) {
                int indexSwap = swapMap.get(firstChar);
                String tmp = strings[i];
                strings[i] = strings[indexSwap];
                strings[indexSwap] = tmp;
                swapMap.remove(firstChar);
            } else {
                swapMap.put(firstChar, i);
            }
        }
        return strings;
    }
}
