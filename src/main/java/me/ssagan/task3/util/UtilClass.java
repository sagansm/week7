package me.ssagan.task3.util;

import java.util.LinkedHashMap;

public class UtilClass {
    public static LinkedHashMap<Character, Integer> countChars(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), countCharInString(str.charAt(i), str));
            }
        }
        return map;
    }

    private static int countCharInString(char ch, String str) {
        int cnt = 0;
        for (int j = str.indexOf(ch, 0); j > -1; j = str.indexOf(ch, j + 1)) {
            cnt++;
        }
        return cnt;
    }
}
