package PatternsPartI;

import java.util.*;

public class Floyd {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n = sc.nextInt();
        int count = 1;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){

                System.out.print(count+" ");
                count +=1 ;

            }
            System.out.println();
        }
    }
}
