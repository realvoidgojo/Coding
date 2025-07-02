package org.rvg.leetcode.LC744;
// find the smallest letter greater than target

public class Main {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreaterLetter(arr,target));
    }

    public static char nextGreaterLetter(char[] letters,char target) {
        int start = 0;
        char res = '5';
        int end = letters.length;
        while (start<=end){
            int mid = start + (end-start)/2;
           if  (letters[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        res = letters[start];
        return res;
    }
}
