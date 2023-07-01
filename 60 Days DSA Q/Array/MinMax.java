

public class MinMax {
    public static int getMax(int arr[], int n){
        int mx = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }

        }

        return mx;
    }
    public static int getMin(int arr[], int n){
        int mn = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] < mn){
                mn = arr[i];
            }
        }

        return mn;
    }
    public static void main(String args[]){

        int arr[] = {10, 20, 22, 56, 101, 98};
        int n = arr.length;
        int find = getMax(arr, n);
        System.out.println("Max : "+find);
        find = getMin(arr, n);
        System.out.println("Min : "+find);

    }
    
}
