package basics;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int s = sc.nextInt();
        if(s>=0)
            System.out.println(s+" is positive number");
        else
            System.out.println(s+" is negative number");
        sc.close();
    }
}
