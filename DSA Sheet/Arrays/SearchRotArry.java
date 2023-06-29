package Arrays;

import java.util.Scanner;


public class SearchRotArry {
    public static int binarySearch(int arr[], int s, int e, int target){
        while(s<=e){
            int mid = (s+e)/2;
            if(target==arr[mid]){
                return mid;
            }
            
            if(target > arr[mid]){
                s = mid+1;
            } else {
                e = mid-1;
            }

            System.out.println(mid+" "+s+" "+e);
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
         
        System.out.println("\nTarget: ");
        int target = sc.nextInt();


        // first find the high value 
        int s=0, e=n-1;
        int high = 0;
        while(s<e){

            int mid = (s+e)/2;
            if (arr[s]<arr[mid]){
                s = mid;
            } else {
                e = mid;
            }
                
        }
         
        if(s==e){
            high = s;
        }
        if (target > arr[high]){
            s = 0;
            e = high;
        } else {
            s = high+1;
            e = n-1;
        }
        
        // second search on the particular section
        int index = binarySearch(arr, s, e, target);
        System.out.println("Index Value: "+index);

    }
}

