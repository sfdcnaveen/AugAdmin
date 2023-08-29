package basics;

public class IfElseIfLadder {
    public static void main(String[] args) {
        //if else if ladder example
        int marks = 23;
        if(marks < 0){
            System.out.println("Marks should not be negative");
        }
        else if(marks<35){
            System.out.println("Fail");
        }
        else if(marks>=35 && marks<50){
            System.out.println("Grade D");
        }
        else if(marks>=50 && marks<60){
            System.out.println("Grade C");
        }
        else if(marks>=70 && marks<80){
            System.out.println("Grade B");
        }
        else if(marks>=80 && marks<90){
            System.out.println("Grade A");
        }
        else if(marks>=90 && marks<=100){
            System.out.println("Grade A+");
        }
        else{
            System.out.println("Invalid Input");
        }

    }
    
}
