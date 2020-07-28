package ru.vstu.codingbat;

import java.util.stream.IntStream;

public class WarmupSimple {

    /**
     *  The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     *  We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     *  Given a string, return a string made of the first 2 chars (if present), however include first char only if it
     *  is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
     */
    public String startOz(String str) {
        String result = "";
        if (str.length() > 0 && str.charAt(0) == 'o') {
            result += "o";
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            result += "z";
        }
        return result;
    }

    /**
     *  Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     */
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    /**
     *  We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in
     *  trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    /**
     *  We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if
     *  one or the other is teen, but not both.
     */
    public boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
    }

    /**
     *  Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if
     *  neither is in that range.
     */
    public int max1020(int a, int b) {
        return IntStream
                .of(a, b)
                .filter(val -> val >= 10 && val <= 20)
                .max()
                .orElse(0);
    }

    /**
     *  Given a string, take the last char and return a new string with the last char added at the front and back, so
     *  "cat" yields "tcatt". The original string will be length 1 or more.
     */
    public String backAround(String str) {
        StringBuilder sb = new StringBuilder(str);
        char last = sb.charAt(sb.length() - 1);
        return sb.append(last).insert(0, last).toString();
    }

    /**
     *  Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value
     *  of a number.
     */
    public boolean nearHundred(int n) {
        throw new UnsupportedOperationException();
    }
}

