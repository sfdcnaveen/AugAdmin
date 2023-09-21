package arrays;

public class MaxElement {
    public static void main(String[] args) {
        int arr[] = {3,34,35,67,86,98,123,23,76,76};
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximum element: "+max);
    }
    
}
