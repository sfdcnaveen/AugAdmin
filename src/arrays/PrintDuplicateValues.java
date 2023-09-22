package arrays;

public class PrintDuplicateValues {
    public static void main(String[] args) {
        int arr[] = {12,23,54,56,23,75,23,75,98,123,234};
        for (int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
