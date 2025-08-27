import java.util.Scanner;
public class StudentVoteChecker {
    public static boolean canStudentVote(int age){
        if(age<0) return false;
        if(age>=18) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[10];
        for(int i=0;i<10;i++){
            ages[i]=sc.nextInt();
        }
        for(int age:ages){
            System.out.println(age+" -> "+(canStudentVote(age)?"Can Vote":"Cannot Vote"));
        }
        sc.close();
    }
}