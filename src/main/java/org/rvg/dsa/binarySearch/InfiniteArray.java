package org.rvg.dsa.binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] num = new int[1000];
        for (int i = 0; i < num.length; i++) {
            num[i] = i * 3;
        }

        int target = 1569;
        int[] range = chunkSearch(num, target);
        int index = BS(num, target, range[0], range[1]);
        System.out.println(num[index]);
    }

    public static int[] chunkSearch(int[] arr, int target) {
        int chunk = 1;
        int start = 0;
        int end = chunk * 2;
        while (start <= end) {
            if (end >= arr.length) {
                end = arr.length - 1;
            }
            if (arr[start] <= target && target <= arr[end]) {
                return new int[]{start, end};
            } else {
                start = end;
                end = end + (end - start + 1) * 2;
            }
        }
        return new int[]{-1, -1};
    }

    public static int BS(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
