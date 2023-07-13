package me.ssagan.task4._main;

import me.ssagan.task4.util.UtilClass;

import java.util.LinkedList;

public class _Main {
    public static void main(String[] args) {
        LinkedList<Integer> sourceList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            sourceList.add((int)(Math.random()*100));
        }
        System.out.println("Исходный список: " + sourceList);
        LinkedList<Integer> targetList = UtilClass.removeEven(sourceList);
        System.out.print("Список без четных чисел: " + targetList);
    }
}
