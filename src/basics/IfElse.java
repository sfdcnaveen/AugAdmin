package basics;

public class IfElse {
    public static void main(String[] args) {
        int a=20, b=30;

        if (a==b) {
            System.out.println("True statement");
            
        } else {
            System.out.println("False Statement");
        }

        int age = 17;
        if(age>18 || age==18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not Eligible");
        }
        
    }
    
}
