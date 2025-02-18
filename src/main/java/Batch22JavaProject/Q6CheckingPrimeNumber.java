package Batch22JavaProject;

import java.util.Scanner;

public class Q6CheckingPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int count=0;


            for(int i =1; i <= number; i++){
                if(number%i ==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Number is Prime");
            }
            else {
                System.out.println("Number is not Prime");
            }








    }
}
