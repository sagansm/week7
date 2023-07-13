package me.ssagan.task1._main;

import me.ssagan.task1.util.RemoveDuplicates;

import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0,1,2,3,4,0,0,0,0,0};
        int[] result = RemoveDuplicates.removeDuplicates(nums);
        System.out.println(Arrays.equals(result, expectedNums));
    }
}
