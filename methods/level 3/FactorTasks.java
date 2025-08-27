public class FactorTasks {
    
    public static int[] findFactors(int num) {
        int count=0;
        for(int i=1;i<=num;i++) if(num%i==0) count++;
        int[] factors=new int[count];
        int idx=0;
        for(int i=1;i<=num;i++) if(num%i==0) factors[idx++]=i;
        return factors;
    }
    public static int greatestFactor(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i:arr) if(i>max) max=i;
        return max;
    }
    public static int sumFactors(int[] arr) {
        int sum=0;
        for(int i:arr) sum+=i;
        return sum;
    }
    public static int productFactors(int[] arr) {
        int prod=1;
        for(int i:arr) prod*=i;
        return prod;
    }
    public static double productCubeFactors(int[] arr) {
        double prod=1;
        for(int i:arr) prod*=Math.pow(i,3);
        return prod;
    }
    public static void main(String[] args) {
        int num=12;
        int[] factors=findFactors(num);
        System.out.print("Factors: ");
        for(int f:factors) System.out.print(f+" ");
        System.out.println();
        System.out.println("Greatest Factor: "+greatestFactor(factors));
        System.out.println("Sum of Factors: "+sumFactors(factors));
        System.out.println("Product of Factors: "+productFactors(factors));
        System.out.println("Product of Cubes: "+productCubeFactors(factors));
    }
}