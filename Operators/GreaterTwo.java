package Operators;
import java.util.*;

public class GreaterTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        if( a > b){
            System.out.println("A is greater.");
        } else {
            System.out.println("B is greater.");
        }
    }
}
