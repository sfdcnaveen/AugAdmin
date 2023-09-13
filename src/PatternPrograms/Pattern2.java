package PatternPrograms;

// * * * * 
// * * * 
// * * 
// *

/*  rows[i]   colns[j]
 *      1       4
 *      2       3
 *      3       2
 *      4       1
 */

//  iteration 
//  int i=1 , 1<=4 -- True  --> enter the loop
//  int j=4,  4>=1 -- True --> enter the loop
//  print *   j-- then j=3
//  j=3 3>=1 -- true --> enter the loop
//  **

public class Pattern2 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=4; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
