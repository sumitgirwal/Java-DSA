import java.util.*;

public class SecondMinMax {

    public static void getSecondLargest(int arr[], int n){

        int fmx = Integer.MIN_VALUE;
        int smx = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){

            if(fmx < arr[i]){
                smx = fmx;
                fmx = arr[i];
            }
            else if(smx < arr[i] && fmx != arr[i]) {
                smx = arr[i];
            }

        }

        System.out.println("fmx: "+fmx+" smx: "+smx);
           
    }

    public static void getSecondSmallest(int arr[], int n){

        int fmn = Integer.MAX_VALUE;
        int smn = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){

            if(fmn > arr[i]){
                smn = fmn;
                fmn = arr[i];
            }
            else if(smn > arr[i] && fmn != arr[i]) {
                smn = arr[i];
            }

        }
        System.out.println("fmn: "+fmn+" smn: "+smn);
    }

    

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        getSecondLargest(arr, n);
        getSecondSmallest(arr, n);
    }
}