public class NumberChecker1 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] storeDigits(int num) {
        String s=String.valueOf(num);
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static boolean isDuck(int num) {
        String s=String.valueOf(num);
        return s.indexOf('0')>0;
    }
    public static boolean isArmstrong(int num) {
        int[] d=storeDigits(num);
        int n=d.length;
        int sum=0;
        for(int i:d) sum+=Math.pow(i,n);
        return sum==num;
    }
    public static void findLargestAndSecondLargest(int[] d) {
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int i:d) {
            if(i>first) {
                second=first;
                first=i;
            } else if(i>second&&i!=first) second=i;
        }
        System.out.println("Largest: "+first+" Second Largest: "+second);
    }
    public static void findSmallestAndSecondSmallest(int[] d) {
        int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
        for(int i:d) {
            if(i<first) {
                second=first;
                first=i;
            } else if(i<second&&i!=first) second=i;
        }
        System.out.println("Smallest: "+first+" Second Smallest: "+second);
    }
    
    public static void main(String[] args) {
        int num=153;
        System.out.println("Digits count: "+countDigits(num));
        int[] digits=storeDigits(num);
        System.out.println("Duck: "+isDuck(num));
        System.out.println("Armstrong: "+isArmstrong(num));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}