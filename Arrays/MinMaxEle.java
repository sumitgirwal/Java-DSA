package Arrays;

public class MinMaxEle {

    public static int findMax(int arr[]){

        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
        
            if( mx < arr[i]) mx = arr[i];
        }
        return mx;

    }

    public static int findMin(int arr[]){

        int mn = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
        
            if( mn > arr[i]) mn = arr[i];
        }
        return mn;

    }

    public static void main(String[] args) {
        
        int arr[] = {1,25, 6, 70, 121,9, 2};

        System.out.println("Min: "+findMin(arr));
        System.out.println("Max: "+findMax(arr));

    }
}


