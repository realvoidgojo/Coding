package org.rvg.dsa.binarySearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = {1, 4, 5, 6, 23, 33, 34, 45};
        Integer[] reverse = {45, 34, 33, 23, 6, 5, 4, 1};

    /* sorting int array
      Arrays.sort(nums);
        System.out.println(Arrays.toString((nums))); */

   /*   sorting Integer array
        Arrays.sort(nums,Collections.reverseOrder());
        System.out.println(Arrays.toString(nums)); */

        int end = nums.length;
        int start = 0;
        System.out.println(binarySearch(nums,start,end,5));
        System.out.println(agnosticBS(reverse,start,end,5));

    }
    public static int binarySearch(Integer[] arr,int start,int end,int target){

        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
    public static int agnosticBS(Integer[] arr,int start,int end,int target){

        if (arr[start]>arr[end-1]) {
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target)  start = mid - 1;
            else end = mid + 1;
        }
        return -1;
        }
        return -1;
    }


}
