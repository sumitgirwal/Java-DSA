

public class Reverse {
    public static void reverse(int arr[], int n){

        int i = 0;
        int j = n-1;

        while(i<j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i+=1;
            j-=1;


        }
        
    }

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        reverse(arr, n);
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
         

    }
    
}
