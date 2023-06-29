package PatternsPartI;

import java.util.*;


// Enter the n number: 
// 5
//      1
//     212
//    32123
//   4321234
//  543212345
 
public class PALINDROMIC {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i+1; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=2; j--){
                System.out.print(j);
            }
            
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }


             
            System.out.println();
        }

         
    }
}



