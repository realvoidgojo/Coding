package org.rvg.dsa.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {23,4,5},
                {23,4,34,56,76,3,5},
                {83,49,128,39,4}
        };
        int target = 76;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }

        }
        return new int[] {-1,-1};
    }
}
