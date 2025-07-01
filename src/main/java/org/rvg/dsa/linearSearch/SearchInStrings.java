package org.rvg.dsa.linearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "ramgopalvarma";
        System.out.println(linearSearch(name,'o'));
    }

    static  int linearSearch(String str ,int target) {
        if (str.isEmpty()) {
            return -1;
        }
        for (int index = 0; index < str.length(); index++) {
            int element = str.charAt(index);
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}