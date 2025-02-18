package Batch22JavaProject;

import java.util.Scanner;

public class Q6CheckingPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        boolean isPrime;

        for(int i = 2; i < number; i++){
            if(number <2){
           System.out.println("Invalid number");
           isPrime=false;
           break;
            }

            if(number% i==0){
                isPrime=false;
                System.out.println(number + " is not Prime");
                break;
            }
            else {
                isPrime =true;
                System.out.println(number + " is Prime");
            }
            break;
        }




    }
}
