package org.rvg.dsa.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23,45,1,34,4,5,6,33};
        System.out.println(linearSearch(nums,5,3,7));
    }
    static int linearSearch (int[] arr, int target, int start , int end) {
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
