import java.util.Scanner;
public class CricketScoreAnalyzer {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter no of batsman: ");
        int n=sc.nextInt();
        System.out.println("enter runs scored by each batsman: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int highestScore=highest(arr);
        int lowestScore=lowest(arr);
        double averageScore=average(arr);
        System.out.println("the highest score by batsman is :"+highestScore);
        System.out.println("the lowest score by batsman is: "+lowestScore);
        System.out.println("average score of batsman is: "+averageScore);
        century(arr);
    }
    private static int lowest(int[] arr) {
        int lowest=arr[0];
        for(int score:arr){
            if(score<lowest){
                lowest=score;
            }
        }
        return lowest;
    }
    private static void century(int[] arr) {
        boolean found=false;
        System.out.print("Century Scorers: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=100){
            System.out.print("Batsman " + (i + 1) + " (" + arr[i] + " runs)  ");                
            found=true;
            }
        }
        if(!found){
            System.out.print("None");
        }
        System.out.println();
    }
    private static double average(int[] arr) {
        int sum=0;
        for(int score:arr){
            sum+=score;
        }
        return (double)sum/arr.length;
    }
    private static int highest(int[] arr) {
        int highest=arr[0];
        for(int score:arr){
            if(score>highest){
                highest=score;
            }
        }
        return highest;
    }
}