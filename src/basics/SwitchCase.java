package basics;

public class SwitchCase {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                break;
        }
        String str = "Hello";
        switch (str) {
            case "Hello":
                System.out.println("Hello");
                break;
        
            default:
                System.out.println("String should be case sensitive");
                break;
        }
    }
}
