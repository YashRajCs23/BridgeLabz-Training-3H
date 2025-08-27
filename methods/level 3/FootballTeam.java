import java.util.Arrays;
import java.util.Random;
public class FootballTeam {
    public static int findSum(int[] arr) {
        int sum=0;
        for(int i:arr) sum+=i;
        return sum;
    }
    public static double findMean(int[] arr) {
        return (double)findSum(arr)/arr.length;
    }
    public static int findShortest(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i:arr) if(i<min) min=i;
        return min;
    }
    public static int findTallest(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i:arr) if(i>max) max=i;
        return max;
    }
    
    public static void main(String[] args) {
        Random r=new Random();
        int[] heights=new int[11];
        for(int i=0;i<11;i++) heights[i]=r.nextInt(101)+150;
        System.out.println("Heights: "+Arrays.toString(heights));
        System.out.println("Shortest: "+findShortest(heights));
        System.out.println("Tallest: "+findTallest(heights));
        System.out.println("Mean: "+findMean(heights));
    }
}