package arrays;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.println("Printing the array elements");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();
        System.out.println();
        int sum = 0;
        System.out.println("Sum of array elements:");
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
