package Batch22JavaProject;

public class Q7First10NumberOfFibSeries {
    public static void main(String[] args) {
        int n1=0, n2=1;
        int sum;
        System.out.print(n1 + " " + n2);
        for(int i = 0; i < 10; i++){
            sum = n1+n2;
            System.out.print(" " +sum);
            n1=n2;
            n2=sum;
        }
    }
}
