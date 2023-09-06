package basics;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i<=5) {
            System.out.println(i);
            i++;
        }

        int j = 10;
        while (j>=1) {
            System.out.println(j);
            if (j==4) {
                break;
            }
            j--;
        }
    }
    
}
