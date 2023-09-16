package PatternPrograms;

// A 
// B B 
// C C C 
// D D D D 
// E E E E E 

public class Pattern16 {
    public static void main(String[] args) {
        int alpha=65;
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha+i)+" ");
            }
            System.out.println();
        }
    }
}
