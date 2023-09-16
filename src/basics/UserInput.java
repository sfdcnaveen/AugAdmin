package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        sc.close(); // To clear a warning that scanner class is not closed
        int sum = a+b;
        System.out.println(sum);

    }
}
