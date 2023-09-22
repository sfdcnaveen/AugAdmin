package arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int arr[] = {12,23,54,56,23,75,23,75,98,123,234};
        int n= arr.length-1;
        int temp;
        for (int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Ascending ordered ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("highest number "+arr[n]);
        System.out.println("If you want to print second highest number");
        System.out.println(arr[n-1]);
    }
}
