

public class PeakElement {
    public static int findPeak(int arr[], int n){
        int start = 0;
        int end = n-1;

        while(start<end){

            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else {
                start = mid+1;
            }

        }

        return arr[start];
    }
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,56,7,88};
        int n = arr.length;
        int find = findPeak(arr, n);
        System.out.println(find);

    }
    
}
