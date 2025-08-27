import java.util.Arrays;
public class NumberChecker3 {
    
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] storeDigits(int num) {
        String s=String.valueOf(num);
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static int[] reverseDigits(int[] arr) {
        int[] rev=new int[arr.length];
        for(int i=0;i<arr.length;i++) rev[i]=arr[arr.length-1-i];
        return rev;
    }
    public static boolean compareArrays(int[] a,int[] b) {
        return Arrays.equals(a,b);
    }
    public static boolean isPalindrome(int num) {
        int[] d=storeDigits(num);
        int[] rev=reverseDigits(d);
        return compareArrays(d,rev);
    }
    public static boolean isDuck(int num) {
        int[] d=storeDigits(num);
        for(int i=1;i<d.length;i++) if(d[i]==0) return true;
        return false;
    }
    public static void main(String[] args) {
        int num=121;
        int[] digits=storeDigits(num);
        System.out.println("Digits: "+Arrays.toString(digits));
        System.out.println("Reversed: "+Arrays.toString(reverseDigits(digits)));
        System.out.println("Palindrome: "+isPalindrome(num));
        System.out.println("Duck: "+isDuck(num));
    }
}