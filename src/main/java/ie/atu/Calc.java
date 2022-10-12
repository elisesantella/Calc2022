package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        subtract();
    }

    public static void subtract()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        if(secondNumber > firstNumber){
            System.out.println("Error: Second number is greater than first number.");
        }
        else{
            int total = firstNumber - secondNumber;
            System.out.println("The total is " + total);
        }
    }
}
