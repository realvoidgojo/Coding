package org.rvg.leetcode.LC33;

public class Main {
    public static void main(String[] args) {
        int [] nums = {5,1,3};
        int target = 5;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                }
                else start = mid + 1;
            }
            else {
                if (nums[start] > target && target >= nums[mid]) {
                    start = mid + 1;
                }
                else end = mid - 1;
            }
        }
        return -1;
    }
}
