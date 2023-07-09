package Arrays;

public class SubArr {

    public static void printArr(int arr[]){

        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void subArrays(int arr[]){

         
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        System.out.println();

        for(int i=0; i<arr.length; i++){

            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                 
                if(mx < sum) mx = sum;
                if(mn > sum) mn = sum;
                System.out.println();
            }
            System.out.println();
        }

         
        System.out.println("Max Subarray: "+mx);
        System.out.println("Min Subarray: "+mn);
        
    }


    public static void main(String[] args) {
        
        int arr[] = {2, 4, 6, 8, 10};

        printArr(arr);
        subArrays(arr);

    }
    
    
}
