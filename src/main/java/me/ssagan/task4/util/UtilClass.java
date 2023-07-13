package me.ssagan.task4.util;

import java.util.LinkedList;

public class UtilClass {

    public static LinkedList<Integer> removeEven(LinkedList<Integer> sourceList) {

        /*concurrent modification exception
        for (int i:sourceList
             ) {
            if(i%2 == 0){
                int ind = sourceList.indexOf(i);
                sourceList.remove(ind);
            }
        }*/

        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                sourceList.remove(i);
                i--;
            }
        }

        return sourceList;
    }

}
