

public class CyclicArray {

    public static void cyclicRotate(int arr[], int n){
        if(n==1) return;

        int temp = arr[n-1];
        int i=n-1;
        while(i>=1){
            arr[i] = arr[i-1];
            i-=1;
        }

        arr[0] = temp;

    }

    public static void main(String args[]){

        int arr[] = {1, 2, 3, 10};
        int n = arr.length;

        cyclicRotate(arr, n);

        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
         

    }
}
