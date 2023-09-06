package basics;

public class Do_While {
    public static void main(String[] args) {
        System.out.println("Print 1 to 10");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=10);
        System.out.println("Print 10 to 1");
         int j = 10;
        do {
            System.out.println(j);
            j--;
        } while (j>=1);
    }
}
