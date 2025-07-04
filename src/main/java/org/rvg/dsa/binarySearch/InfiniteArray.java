package org.rvg.dsa.binarySearch;

import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] num = {
                3, 5, 8, 12, 15, 18, 22, 24, 27, 30,
                34, 37, 39, 41, 44, 47, 49, 52, 55, 58,
                60, 63, 66, 69, 72, 75, 78, 80, 83, 86,
                89, 92, 95, 97, 100, 103, 106, 109, 112, 115,
                118, 121, 124, 127, 130, 133, 136, 139, 142, 145,
                148, 151, 154, 157, 160, 163, 166, 169, 172, 175,
                178, 181, 184, 187, 190, 193, 196, 199, 202, 205,
                208, 211, 214, 217, 220, 223, 226, 229, 232, 235,
                238, 241, 244, 247, 250, 253, 256, 259, 262, 265,
                268, 271, 274, 277, 280, 283, 286, 289, 292, 295,
                298
        };
        int target = 241;
        int[] range = chunkSearch(num,target);
        int index = BS(num,target,range[0],range[1]);
        System.out.println(num[index]);

    }

    public static int[] chunkSearch(int[] arr,int target) {
        int chunk = 1;
        int start = 0;
        int end = chunk*2;
        while (start<=end) {
            if (arr[start] <= target && target <= arr[end]) {
                return new int[] {start,end};
            }
            else {
                start = end;
                end = end + (end-start+1) * 2;
            }
        }
        return new int[] {-1,-1};
    }

    public static int BS(int[] arr, int target, int start, int end) {
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid] == target) return mid;
            else if ( arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return  -1;
    }
}
