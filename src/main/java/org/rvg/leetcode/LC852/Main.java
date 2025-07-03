package org.rvg.leetcode.LC852;

public class Main {

    public static void main(String[] args) {
        int[] nums = {0,10,5,2};
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while (start<end){
            mid = start + (end-start)/2;
            if (nums[mid]<nums[mid+1]) start = mid+1;
            else end = mid;
        }
        System.out.println(nums[start] +" "+ start);
    }

}
