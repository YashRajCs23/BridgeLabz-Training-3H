import java.util.*;
public class StudentScorecard {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = (double) total / 3;
            double perc = ((double) total / 300) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return result;
    }
    public static String getGrade(double perc) {
        if (perc >= 80) return "A";
        else if (perc >= 70) return "B";
        else if (perc >= 60) return "C";
        else if (perc >= 50) return "D";
        else if (perc >= 40) return "E";
        else return "R";
    }
    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + 
                               (int) result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "\t\t" + getGrade(result[i][2]));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] result = calculateResults(scores);
        displayScorecard(scores, result);
    }
}