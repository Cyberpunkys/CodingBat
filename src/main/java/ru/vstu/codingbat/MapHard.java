package ru.vstu.codingbat;

import java.util.HashMap;
import java.util.Map;

public class MapHard {

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
}
