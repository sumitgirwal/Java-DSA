package Arrays;
import java.util.*;

public class LinearSearch {
    public static int linearSearch(int arr[], int target){

        for(int i=0; i<arr.length; i++){

            if(arr[i]==target) return i;
        }

        return -1;

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target elements:");
        int target = sc.nextInt();

        System.out.println(linearSearch(arr, target) == -1 ? "Not Found": "Found" );
    }
}
