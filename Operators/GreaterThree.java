package Operators;
import java.util.*;

public class GreaterThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();
        if( (a >= b) && (a >= c)) {
            System.out.println("A is greater: "+a);
        } else if( (b > c)) {
            System.out.println("B is greater: "+b);
        } else {
            System.out.println("C is greater: "+c);
        }
    }
}
