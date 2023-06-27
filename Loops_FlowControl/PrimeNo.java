package Loops_FlowControl;
import java.util.*;

public class PrimeNo {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n = sc.nextInt();
        
        Boolean isPrime = true;

        for(int i=2; i<=Math.sqrt(n); i++){
            if( n%i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println(n+" is a Prime Number.");
        } else {
            System.out.println(n+" is Not a Prime Number.");
        }
    }
    
}