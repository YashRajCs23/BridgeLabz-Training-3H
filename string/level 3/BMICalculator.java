import java.util.Scanner;
public class BMICalculator {
    static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = 10;
        double[][] data = new double[people][2];
        for (int i = 0; i < people; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < people; i++) {
            double w = data[i][0];
            double h = data[i][1] / 100; // cm → m
            double bmi = Math.round((w / (h * h)) * 10.0) / 10.0;
            System.out.println((i + 1) + "\t" + w + "\t\t" + data[i][1] + "\t\t" + bmi + "\t" + getStatus(bmi));
        }
    }
}