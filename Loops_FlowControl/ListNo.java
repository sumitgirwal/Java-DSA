package Loops_FlowControl;
import java.util.*;

public class ListNo {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number's: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++){
        
            System.out.println("Enter "+i+" Number: ");
            sum = sum + sc.nextInt();
        
        }

        System.out.println("Total Output: "+sum);

    }
    
}