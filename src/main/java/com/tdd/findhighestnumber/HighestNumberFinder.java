package com.tdd.findhighestnumber;

public class HighestNumberFinder {


    public int findHighestNumber(int[] array) {
        int result = 0;
        if(array.length == 1) {
            result = array[0];
        } else {
            if(array[0] > array[1]) {
                result = array[0];
            } else {
                result = array[1];
            }
        }

        return result;
    }
}
