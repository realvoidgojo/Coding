package org.rvg.leetcode.LC1095;

public class Main {
    /*
    Input: mountainArr = [1,2,3,4,5,3,1], target = 3
    Output: 2
    */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peak = findPeak(arr);
        int f = BS(arr, target, 0, peak, false);
        int s = BS(arr, target, peak + 1, arr.length - 1, true);
        if (f>s) System.out.println(s);
        else System.out.println(f);
    }

    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    public static int BS(int[] arr, int target, int start, int end, boolean isAgnostic) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) {
                if (!isAgnostic) end = mid - 1;
                else start = mid + 1;
            } else {
                if (!isAgnostic) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
