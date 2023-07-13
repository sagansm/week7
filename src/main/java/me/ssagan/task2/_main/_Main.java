package me.ssagan.task2._main;

import me.ssagan.task2.util.BracketStack;
import org.w3c.dom.ls.LSOutput;

public class _Main {

    public static void main(String[] args) {
        String sequence = "()";
        System.out.println("Поледовательность " + sequence + " верна? " + BracketStack.isCorrect(sequence));

        sequence = "()[]{}";
        System.out.println("Поледовательность " + sequence + " верна? " + BracketStack.isCorrect(sequence));

        sequence = "([)]";
        System.out.println("Поледовательность " + sequence + " верна? " + BracketStack.isCorrect(sequence));
    }
}
