

public class MergeSort {
    
    public static void merge(int arr[], int start, int end, int mid){

        int l1 = mid - start;
        int l2 = end - mid+1;

        int first[] = new int[l1];
        int second[] = new int[l2];

        int mainCount = start;

        for(int i=0; i<l1; i++){
            first[i] = arr[mainCount++];
        }

        for(int i=0; i<l2; i++){
            second[i] = arr[mainCount++];
        }


        int i=0;
        int j=0;
        mainCount = start;


        while(i<l1 && j<l2){

            if(first[i]<second[i]){
                arr[mainCount++] = first[i++];
            } else {
                arr[mainCount++] = second[j++];
            }
        }

        while(i<l1){
            arr[mainCount++] = first[i++];
        }

        while(j<l2){
            arr[mainCount++] = second[j++];
        }


    }

    public static void mergeSort(int arr[], int start, int end){

        if(start>=end){
            return;
        }

        // finding mid
        int mid = start+(end-start)/2;

        // sorting left side
        mergeSort(arr, start, mid);

        // sorting right side
        mergeSort(arr, mid+1, end);

        // merge
        merge(arr, start, end, mid);
        

        
    }

    public static void main(String args[]){

        int arr[] = {3, 2, 5, 7, 4};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
         

    }
    
}
