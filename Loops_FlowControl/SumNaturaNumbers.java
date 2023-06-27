package Loops_FlowControl;
import java.util.*;

public class SumNaturaNumbers {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }

        System.out.println(sum);
        sc.close();
    }
    
}
