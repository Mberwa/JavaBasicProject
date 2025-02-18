package Batch22JavaProject;

public class Q4SumOfEvenAndOddFrom2Darray {
    public static void main(String[] args) {
        int totalEvenNumbers=0;
        int totalOddNumbers=0;
        int[][] numbers = { {1,2,3,4},
                            {10,5,4,6,7},
                            {9,7,8,6,3}
        };
        for (int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                if(numbers[i][j] % 2 == 0){
//                    System.out.print(numbers[i][j]+ " ");
                    totalEvenNumbers+=numbers[i][j];
                }
                else {
                    totalOddNumbers+=numbers[i][j];

                }

            }
            System.out.println();
        }
        System.out.println("The total number of even numbers from 2Darray is "+totalEvenNumbers);
        System.out.println("The total number of odd numbers from 2Darray is "+totalOddNumbers);
    }
}
