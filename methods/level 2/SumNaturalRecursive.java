import java.util.Scanner;
public class SumNaturalRecursive {
    public static int sumRecursive(int n){
        if(n==0) return 0;
        return n+sumRecursive(n-1);
    }
    public static int sumFormula(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0) System.out.println("Not a natural number");
        else{
            int rec=sumRecursive(n);
            int formula=sumFormula(n);
            System.out.println("Recursive Sum: "+rec);
            System.out.println("Formula Sum: "+formula);
            sc.close();
        }
    }
}