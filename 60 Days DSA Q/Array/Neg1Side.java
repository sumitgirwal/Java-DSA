public class Neg1Side {

    public static void swap(int first, int second){

        int temp = first;
        first = second;
        second = temp;

    }

    public static void negative(int arr[], int n){

        int i = 0;
        int j = n-1;

        while(i<=j){

            while(arr[i]>0)
                i++;
            while(arr[j]<0)
                j--;
            
            if(arr[i]<0 && arr[j]>0){
                swap(arr[i++], arr[j--]);
            }

        }

    }

    public static void main(String args[]){

        int arr[] = {-3, -2, -5, 7, 4, 9};
        int n = arr.length;
        negative(arr, n);
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
         

    }
}
