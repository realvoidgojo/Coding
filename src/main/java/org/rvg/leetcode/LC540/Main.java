package org.rvg.leetcode.LC540;

/* Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        int start = 0;
        int end = arr.length - 1;
        System.out.println(BS(arr,start,end));
    }

    public static int BS(int[] arr, int start, int end) {
        while (start < end) {
            int mid = start + (end-start)/2;
            if (mid%2==1) mid--;
            if (arr[mid] == arr[mid+1])  start = mid + 2;
            else end = mid;
        }
        return arr[start]; // Add a return to satisfy compiler
    }
}
