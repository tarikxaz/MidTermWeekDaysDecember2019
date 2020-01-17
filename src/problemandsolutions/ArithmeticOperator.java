package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
    double num1;
    double num2;

        Scanner sn=new Scanner(System.in);
        System.out.println("Enter first number");
        num1=sn.nextDouble();
        System.out.println("Enter second number");
        num2=sn.nextDouble();

        System.out.println("The addition of the two number is:" + (num1+num2));
        System.out.println("The subtraction of the two number is:"+ (num1-num2));
        System.out.println("The multiplication of the two number is:"+(num1*num2));
        System.out.println("The Division of the two number is: "+ (num1/num2));
        System.out.printf("The Division of the two number is: %.3f",(num1/num2));


    }



}
