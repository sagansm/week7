package me.ssagan.task1.util;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] nums) {
        //НАПИШИТЕ СВОЙ КОД ЗДЕСЬ

        int[] deduplicateArray = new int[nums.length];
        deduplicateArray[0] = nums[0];
        int l = 0;

        for (int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]) {
                l++;
                deduplicateArray[l] = nums[i];
            }
        }
        return deduplicateArray;
    }

}
