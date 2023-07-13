package me.ssagan.task3._main;

import me.ssagan.task3.util.UtilClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class _Main {
    public static void main(String[] args) {
        String str = "hello world";
        LinkedHashMap<Character, Integer> map = UtilClass.countChars(str);
        for (Map.Entry<Character, Integer> element : map.entrySet()
        ) {
            System.out.println(element.getKey() + " - " + element.getValue());
        }
    }
}
