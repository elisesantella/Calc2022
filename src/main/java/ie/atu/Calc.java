package ie.atu;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        add();

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
