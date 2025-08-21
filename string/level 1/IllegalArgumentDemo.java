import java.util.Scanner;
public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.next();
        System.out.println(str.substring(5,2));
    }
}