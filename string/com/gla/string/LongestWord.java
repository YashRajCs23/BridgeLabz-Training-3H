package com.gla.string;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java makes coding fun and powerful";
        String[] words = sentence.split(" ");
        String longest = "";
        for (String w : words) if (w.length() > longest.length()) longest = w;
        System.out.println("Longest Word: " + longest);
    }
}