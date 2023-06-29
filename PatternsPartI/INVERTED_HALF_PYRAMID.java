package PatternsPartI;

import java.util.*;

public class INVERTED_HALF_PYRAMID {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i+1; j++){

                System.out.print(j);

            }
            System.out.println();
        }
    }
}
