package com.gla.string;

public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) freq[ch]++;
        char ans = 0;
        int max = 0;
        for (int i = 0; i < 256; i++)
            if (freq[i] > max) { max = freq[i]; ans = (char) i; }
        System.out.println("Most Frequent Character: " + ans);
    }
}