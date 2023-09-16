package basics;

import java.util.Scanner;

public class UserInput3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name");
        String fname = sc.nextLine();
        System.out.println("Enter Last name");
        String lname = sc.nextLine();

        System.out.println("Full Name:"+fname+" "+lname);

    }
}
