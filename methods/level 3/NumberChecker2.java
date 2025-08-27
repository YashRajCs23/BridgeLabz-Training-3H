public class NumberChecker2 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] storeDigits(int num) {
        String s=String.valueOf(num);
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static int sumDigits(int[] d) {
        int sum=0;
        for(int i:d) sum+=i;
        return sum;
    }
    public static int sumSquares(int[] d) {
        int sum=0;
        for(int i:d) sum+=Math.pow(i,2);
        return sum;
    }
    public static boolean isHarshad(int num) {
        int[] d=storeDigits(num);
        int sum=sumDigits(d);
        return num%sum==0;
    }
    public static void frequencyDigits(int[] d) {
        int[][] freq=new int[10][2];
        for(int i=0;i<10;i++) freq[i][0]=i;
        for(int i:d) freq[i][1]++;
        for(int i=0;i<10;i++) if(freq[i][1]>0) System.out.println(freq[i][0]+": "+freq[i][1]);
    }

    public static void main(String[] args) {
        int num=21;
        int[] digits=storeDigits(num);
        System.out.println("Digits count: "+countDigits(num));
        System.out.println("Sum of digits: "+sumDigits(digits));
        System.out.println("Sum of squares: "+sumSquares(digits));
        System.out.println("Harshad: "+isHarshad(num));
        frequencyDigits(digits);
    }
}