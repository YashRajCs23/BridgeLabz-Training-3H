import java.util.Scanner;
public class Trigonometry {
    public static double[] calculateTrigonometricFunctions(double angle){
        double radians=Math.toRadians(angle);
        return new double[]{Math.sin(radians),Math.cos(radians),Math.tan(radians)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        double[] res=calculateTrigonometricFunctions(angle);
        System.out.println("sin: "+res[0]+" cos: "+res[1]+" tan: "+res[2]);
        sc.close();
    }
}