package Operators;
import java.util.*;

public class Calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Operator (+, -, *, /, %): ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+': {
                System.out.println("Addition: "+(a+b));
                break;
            }

            case '*': {
                System.out.println("Multiplication: "+(a*b));
                break;
            }

            case '-': {
                System.out.println("Subtraction: "+(a-b));
                break;
            }

            case '/': {
                System.out.println("Division: "+(a/b));
                break;
            }

            case '%': {
                System.out.println("Moduler: "+(a%b));
                break;
            }

            default:
                System.out.println("Wrong choice!");
        }
         
         
             
    }
}


