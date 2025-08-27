public class RandomArrayStats {
    
    public static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++) arr[i]=1000+(int)(Math.random()*9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers){
        int min=numbers[0],max=numbers[0],sum=0;
        for(int x:numbers){
            sum+=x;
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        double avg=(double)sum/numbers.length;
        return new double[]{avg,min,max};
    }
    public static void main(String[] args){
        int[] arr=generate4DigitRandomArray(5);
        for(int x:arr) System.out.print(x+" ");
        System.out.println();
        double[] stats=findAverageMinMax(arr);
        System.out.println("Average:"+stats[0]+" Min:"+stats[1]+" Max:"+stats[2]);
    }
}