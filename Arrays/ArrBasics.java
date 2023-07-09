package Arrays;
import java.util.*;

public class ArrBasics {
    
    public static void printArr(int arr[]){
    
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void inputArr(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); 
        }
        System.out.println();

    }

    public static void main(String args[]){

        int arr[] = new int[5];
        int arr2[] = {1,2,3,4,5};

        inputArr(arr);
        printArr(arr);
        printArr(arr2);

        

    }
}
