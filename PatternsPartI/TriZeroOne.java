package PatternsPartI;

import java.util.*;

public class TriZeroOne {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n = sc.nextInt();
        int check = 1;
        for(int i=1; i<=n; i++){
            if(i%2==0) check = 2;
            else check = 1;
            for(int j=1; j<=i; j++){
                if(check%2==0){
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
                check +=1 ;
            }
            System.out.println();
        }
    }
}
