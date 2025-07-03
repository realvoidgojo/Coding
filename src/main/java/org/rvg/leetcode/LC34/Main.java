package org.rvg.leetcode.LC34;

import java.util.Arrays;

public class Main {
    /*

    Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

     */

    public static void main(String[] args) {

        Integer[] nums = { 5,7,7,8,8,10 };
        int target = 8;
        System.out.println(BS(nums, target, true) + " " + BS(nums, target, false));

    }

    public static int BS(Integer[] arr, int target, boolean isStart) {

        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while (start<=end) {
            int mid = start +  (end -start)/2;
            if (arr[mid] == target)  {
                result = mid;
                if (isStart) end = mid-1;
                else start = mid + 1;
            }
            else if  (arr[mid]>target) end = mid -1;
            else start = mid + 1;
        }
        return result;
    }

}
