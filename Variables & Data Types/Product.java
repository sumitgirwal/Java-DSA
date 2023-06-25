import java.util.Scanner;

public class Product {
    public static void main(String args[]){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        a = sc.nextInt();
        System.out.println("Enter Second Number:");
        b = sc.nextInt();
        System.out.println("Product : "+ (a*b));
        
    }
}
