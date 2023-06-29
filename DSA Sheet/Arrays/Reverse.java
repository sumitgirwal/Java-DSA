package Arrays;

import java.util.Scanner;


public class Reverse {
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
            int i = 0;
            int j = n-1;

            while(i<=j){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i+=1;
                j-=1;
            }
              
        }
        System.out.println();
        System.out.println("Array Elements: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}

