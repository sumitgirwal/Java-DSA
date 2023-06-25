import java.util.*;

public class Comments {
    public static void main(String args[]){
        // this is single line comment
        /*
         * This is multiline comment
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        int sum = number1+number2;
        System.out.println("Sum: "+sum);
    }
}
