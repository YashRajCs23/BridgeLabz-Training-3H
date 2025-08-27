import java.util.Scanner;
public class Chocolates {
    public static int[] findRemainderAndQuotient(int number,int divisor){
        return new int[]{number%divisor,number/divisor};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numberOfChocolates=sc.nextInt();
        int numberOfChildren=sc.nextInt();
        int[] res=findRemainderAndQuotient(numberOfChocolates,numberOfChildren);
        System.out.println("Each child gets: "+res[1]+" Remaining: "+res[0]);
        sc.close();
    }
}