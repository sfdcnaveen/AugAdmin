package basics;

public class LoopingStatements {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("iteration:"+i);
            
        }
        for (int j = 1; j <= 10; j++) {
            if (j==4) {
                break;                      //Break the loop
            }
            System.out.println("iteration:"+j);
            
        }
        for (int k = 1; k <= 10; k++) {
            if (k==4) {
                continue;                      //skips the iteration step which skips printing 4 we can use OR statement in condition but not AND
            }
            System.out.println(k);
            
        }
    }
    
}
