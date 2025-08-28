import java.util.Scanner;
public class EmployeeSalarySlip {
    static Scanner sc=new Scanner(System.in);
    public static void inputDetails(String name[],int salaries[]){
        for(int i=0;i<name.length;i++){
            System.out.println("\nEnter details for Employee"+(i+1));
            System.out.print("Name: ");
            name[i]=sc.next();
            System.out.print("Basic Salary: ");
            salaries[i]=sc.nextInt();
        }
    }
    public static void printSalarySlip(String name,int basic){
        double hra=0.20*basic;
        double da=0.10*basic;
        double gross=basic+hra+da;
        double tax=(gross>50000)?0.10*gross:0;
        double netSalary=gross-tax;
        System.out.println("\n====================================");
        System.out.println("      Salary Slip for "+name);
        System.out.println("====================================");
        System.out.println("Basic Salary : Rs "+basic);
        System.out.println("HRA (20%)    : Rs "+hra);
        System.out.println("DA (10%)     : Rs "+da);
        System.out.println("Gross Salary : Rs "+gross);
        System.out.println("Tax Deduction: Rs "+tax);
        System.out.println("Net Salary   : Rs "+netSalary);
        System.out.println("====================================");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        String[] names=new String[n];
        int[] salaries=new int[n];
        inputDetails(names,salaries);
        for(int i=0;i<n;i++){
            printSalarySlip(names[i],salaries[i]);
        }
        sc.close();
    }
}