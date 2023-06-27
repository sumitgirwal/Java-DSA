package Loops_FlowControl;
import java.util.*;

public class ReverseNo {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        while(n!=0){

            int last = n%10;
            sum = sum*10 + last;
            n /= 10;
        }  
        System.out.println(sum);
        sc.close();
    }
    
}