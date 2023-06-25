import java.util.Scanner;

public class Cost{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price:");
        System.out.println("Pencil:");
        int pencil = sc.nextInt();
        System.out.println("Pen:");
        int pen = sc.nextInt();
        System.out.println("Eraser:");
        int eraser = sc.nextInt();
        System.out.println("Adding 18% GST.");

        float $sum = pen+pencil+eraser;
        $sum = $sum+($sum*0.18f);
        System.out.println("Payable Amt:"+$sum);


    }
}