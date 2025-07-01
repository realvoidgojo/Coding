package org.rvg.dsa.linearSearch;

public class minimumNumber {
    public static void main(String[] args) {
        int[] nums = {23,45,1,34,4,5,6,33};
        System.out.println(min(nums));
    }
    static int min (int[] arr) {

        int small = arr[0];
        for (int index = 0; index < arr.length; index++) {

            if (arr[index] < small ) {
               small = arr[index];
            }
        }

        return small;
    }
}