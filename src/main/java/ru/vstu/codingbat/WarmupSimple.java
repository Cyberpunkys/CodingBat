package ru.vstu.codingbat;

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
}
