public class NumberChecker5 {
    
    public static int sumOfDivisors(int num) {
        int sum=0;
        for(int i=1;i<=num/2;i++) if(num%i==0) sum+=i;
        return sum;
    }
    public static boolean isPerfect(int num) {
        return sumOfDivisors(num)==num;
    }
    public static boolean isAbundant(int num) {
        return sumOfDivisors(num)>num;
    }
    public static boolean isDeficient(int num) {
        return sumOfDivisors(num)<num;
    }
    public static int factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
    public static boolean isStrong(int num) {
        int n=num,sum=0;
        while(n>0) {
            sum+=factorial(n%10);
            n/=10;
        }
        return sum==num;
    }
    public static void main(String[] args) {
        int num=145;
        System.out.println("Perfect: "+isPerfect(num));
        System.out.println("Abundant: "+isAbundant(num));
        System.out.println("Deficient: "+isDeficient(num));
        System.out.println("Strong: "+isStrong(num));
    }
}