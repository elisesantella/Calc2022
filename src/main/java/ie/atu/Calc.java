package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        multiply();
    }
    public static void multiply(){
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();

        System.out.println("Please enter second number: ");
        int secondNum = input.nextInt();


        int total = firstNum*secondNum;
        System.out.println("Total: "+total);
    }
}
