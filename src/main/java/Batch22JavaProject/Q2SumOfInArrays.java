package Batch22JavaProject;

public class Q2SumOfInArrays {
    public static void main(String[] args) {
        int total=0;
        int[] sum = {18,34,66,29,90,12};
        for(int i = 0; i < sum.length; i++){
            total+=sum[i];
        }
        System.out.println("The sum of array is "+total);
    }
}
