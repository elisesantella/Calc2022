package ie.atu;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        multiply();
        subtract();
        add();
    }
    public static void multiply(){
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();

        System.out.println("Please enter second number: ");
        int secondNum = input.nextInt();


        int total = firstNum*secondNum;
        System.out.println("Total: "+total);
        add();
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

    public static void add(){
        Scanner inputs = new Scanner(System.in);
        System.out.println(" Enter value 1: \n");
        int valueOne = inputs.nextInt();

        System.out.println(" Enter value 2: \n");
        int valueTwo = inputs.nextInt();

        int total = valueOne + valueTwo;
        System.out.println("The total of the two values together is: " + total);
    }
}
