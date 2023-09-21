package arrays;

public class MinElement {
    public static void main(String[] args) {
        int arr[] = {3,34,35,67,86,98,123,23,76,76};
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum element: "+min);
    }
}
