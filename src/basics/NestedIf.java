package basics;

public class NestedIf {
    public static void main(String[] args) {
        int age = 5;
        int weight = 80;
        if (age>18) {
            if (weight>50) {
                System.out.println("Eligible for blood donation");
            } else {
                System.out.println("Not eligible for blood donation");
            }
            
        }else{
            System.out.println("Age should be greater than 18");
        }
        
    }
    
}
