public class EmployeeBonus {
    
    public static int[][] generateData(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            int salary = (int) (Math.random() * 90000) + 10000;
            int years = (int) (Math.random() * 11);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
            result[i][2] = oldSalary;
        }
        return result;
    }
    public static void displayResult(int[][] data, double[][] result) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("EmpID\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < data.length; i++) {
            int years = data[i][1];
            double oldSalary = result[i][2];
            double bonus = result[i][0];
            double newSalary = result[i][1];
            System.out.println((i + 1) + "\t" + (int) oldSalary + "\t\t" + years + "\t" + (int) bonus + "\t" + (int) newSalary);
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        System.out.println("TOTAL\t" + (int) totalOldSalary + "\t\t\t" + (int) totalBonus + "\t" + (int) totalNewSalary);
    }
    public static void main(String[] args) {
        int n = 10;
        int[][] data = generateData(n);
        double[][] result = calculateBonus(data);
        displayResult(data, result);
    }
}