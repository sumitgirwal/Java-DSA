package Arrays;

public class Reverse {

    public static void printArr(int arr[]){

        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void reverse(int arr[]){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        
    }


    public static void main(String[] args) {
        
        int arr[] = {1,25, 6, 70, 121,9, 2};

        printArr(arr);
        reverse(arr);
        printArr(arr);
         

    }
    
    
}
