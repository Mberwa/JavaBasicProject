package Batch22JavaProject;

public class Q5SwappingTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("Numbers before swap are " + a + " " + b);
//        temp=a;
//        a =b;
//        b=temp;
        a = a+b;
        b = a-b;
        a= a-b;
        System.out.println("Numbers after swap are " + a + " " + b);

    }
}
