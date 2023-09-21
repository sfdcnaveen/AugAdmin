package arrays;

public class EvenPositionValues {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Print Values in even index position");       
        for(int i=2; i<=arr.length-1; i=i+2){
            System.out.println(arr[i]);
        }
    }
}
