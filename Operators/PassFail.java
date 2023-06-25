package Operators;
import java.util.*;

public class PassFail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Marks: ");
        int marks = sc.nextInt();
         
        if( marks >= 33 ) {
            System.out.println("Pass.");
        } else  {
            System.out.println("Fail.");
        }
             
    }
}


