package Arrays;
import java.util.*;

public class BinarySearch {
    public static int binarySearch(int arr[], int target){
        
        int n = arr.length;
        int start = 0; int end = n-1;

        while(start<=end){

            int mid = start+(end-start)/2;

            if(arr[mid] == target) return mid;
            if(arr[mid]>target) end = mid-1;
            else start = mid+1;
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

        System.out.println(binarySearch(arr, target) == -1 ? "Not Found": "Found" );
    }
}
