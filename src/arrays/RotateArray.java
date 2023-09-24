package arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {12,23,54,56,23,75,23,75,98,123,234};
        int k=2;

        int len = arr.length;
        k=k%len;
        int[] temp = new int[len];

        for(int i=0; i<len; i++)
        {
            temp[(i+k)%len]=arr[i];

        }
        for(int i=0; i<len; i++)
        {
            arr[i]=temp[i];
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}


