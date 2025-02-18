package Batch22JavaProject;

public class Q1ArrayOfTemp {
    public static void main(String[] args) {


          double[] temperature = {23.1,30.3,10.2,43.2,87.2,15.3,54.3,66.2};
          double highestTemp = temperature[0];
          double lowestTemp = temperature[0];
    for(int i = 1; i < temperature.length; i++){
        if(temperature[i] > highestTemp){
            highestTemp = temperature[i];
        }
        if(temperature[i] < lowestTemp){
            lowestTemp = temperature[i];
        }



    }
        System.out.println("Largest temp is " + highestTemp);
        System.out.println("Lowest temp is " + lowestTemp);









    }
}
