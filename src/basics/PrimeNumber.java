package basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int flag=0,m=0;
        if(n==0 || n==1)
        {
            System.out.println("Not a Prime Number");
        }
        else
        {
            for(int i =2; i<=Math.sqrt(n);i++)
            {
                if (n%i==0){
                    flag=1;
                    break;
                }

            }
            if(flag==0){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a Prime Number");
            }
        }
    }
}
