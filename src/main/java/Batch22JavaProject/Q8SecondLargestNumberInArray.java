package Batch22JavaProject;

public class Q8SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] a = {12,34,23,65,30,78};
        int largest = a[0];
        int secondLargest =a[0];
        for(int i = 2; i < a.length; i++){
            if(a[i] > largest ){
                secondLargest = largest;
                largest = a[i];
            }
            else if(a[i] > secondLargest){
                secondLargest = a[i];
            }
        }
        System.out.println("The second largest number is " + secondLargest);
    }
}
