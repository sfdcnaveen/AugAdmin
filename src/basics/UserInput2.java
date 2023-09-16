package basics;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float a = sc.nextFloat();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        sc.close(); // To clear a warning that scanner class is not closed
        double sum = a+b;
        System.out.println(sum);

    }
}
