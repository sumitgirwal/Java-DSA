package Arrays;

import java.util.Scanner;


public class MaxSumSubArray {
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
             
            int currentSum = 0, mxSum = 0;
            for(int i : arr){

                currentSum += i;

                if(currentSum>mxSum)
                    mxSum = currentSum;

                if(currentSum<0){
                    currentSum = 0;
                }

            }

            System.out.println(mxSum);

              
        }
        
         

    }
}

