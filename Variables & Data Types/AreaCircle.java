import java.util.Scanner;

public class AreaCircle {
    public static void main(String args[]){
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius: ");
        float r = sc.nextFloat();
        float area = pi*r*r;
        System.out.println("Area Circle:" + area);
    }
}
