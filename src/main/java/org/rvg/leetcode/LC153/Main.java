package org.rvg.leetcode.LC153;

public class Main {
    public static void main(String[] args) {
        Integer[] num1 = {4,5,6,7,45,1,2};
        Integer[] num2 = {0,1,2,4,5,6,7};
        System.out.println(minRotSortedArray(num1));
    }
    public static int minRotSortedArray(Integer[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            int mid = start + (end - start)/2;
            if (arr[mid]>arr[end]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return  arr[start];
    }
}
