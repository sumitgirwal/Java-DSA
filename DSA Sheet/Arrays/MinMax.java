package Arrays;

import java.util.Scanner;


public class MinMax {
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

        if(n==1){
            System.out.println(arr[0]);
        } else {
            int mx = arr[0];
            int mn = arr[0];

            for(int i : arr){
                if(mx < i)
                    mx = i; 
                if(mn > i)
                    mn = i;
            }
            System.out.println("Your Min and Max element : ");
            System.out.println(mx+" "+mn);
        }

    }
}
