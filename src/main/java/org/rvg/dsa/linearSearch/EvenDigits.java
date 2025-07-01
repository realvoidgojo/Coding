package org.rvg.dsa.linearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {-12,245,738,345,745,865};
        System.out.println(findNumbers(nums));
        System.out.println(findDigits(nums[0]));
        System.out.println(Digits(nums[0]));

    }
    static int findNumbers(int[] arr) {
        int count = 0;
        for (int ele:arr) {
            if(ele%2==0) {
                count++;
            }
        }
        return count;
    }
    static int findDigits(int num) {

        int count = 0;
        if (num <0) num *= -1;
        while (0 < num) {
            count++;
            num /= 10;
        }
        return count;
    }
    static int Digits(int num) {
        if (num <0) num*=-1;
        return (int) (Math.log10(num) + 1);
    }
}
