package PatternsPartI;

import java.util.*;


// 5
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

public class BUTTERFLY {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }

            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
