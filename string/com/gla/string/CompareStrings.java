package com.gla.string;

public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        int len = Math.min(s1.length(), s2.length());
        int cmp = 0;
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cmp = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }
        if (cmp == 0) cmp = s1.length() - s2.length();
        System.out.println(cmp < 0 ? s1 + " comes before " + s2 :
                cmp > 0 ? s2 + " comes before " + s1 :
                        "Both are equal");
    }
}