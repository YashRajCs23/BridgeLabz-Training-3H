package com.gla.string;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char rem = 'l';
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) if (ch != rem) sb.append(ch);
        System.out.println("Modified String: " + sb);
    }
}