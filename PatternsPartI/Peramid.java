package PatternsPartI;
import java.util.*;

/*
 
Enter the n number: 
4
*
**
***
****

*/

public class Peramid {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
