

package org.rvg.dsa.linearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23,45,1,34,4,5,6,33};
        System.out.println(linearSearch(nums,1));
    }

    static  int linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}

