

public class QuickSort {
    
    public static int getPivot(int arr[], int s, int e){

        // setting pivot to first 
        int pivotIndex = s;

        // count the less element
        int count = 0;
        for(int i=s+1; i<=e; i++){
            if(arr[i]<=arr[pivotIndex]){
                count += 1;
            }
        }

        // swap the pivot element and count element
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[s+count];
        arr[s+count] = temp;

        // updating pivot to new index
        pivotIndex = s+count;

        // setting less values
        int i=s; int j=e;
        while(i<pivotIndex && j>pivotIndex){

            while(arr[i]<=arr[pivotIndex]){
                i+=1;
            }

            while(arr[j]>arr[pivotIndex]){
                j-=1;
            }

            if(i<pivotIndex && j>pivotIndex){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i+=1;
                j-=1;
            }

        }

        return pivotIndex;

    }

    public static void quickSort(int arr[], int s, int e){
        
        // reaching end
        if(s>=e){
            return;
        }

        // get pivot value
        int pivot = getPivot(arr, s, e);

        // sorting on left side
        quickSort(arr, s, pivot-1);

        // sorting on right side
        quickSort(arr, pivot+1, e);


        
    }
    
    public static void main(String args[]){

        int arr[] = {9, 7, 5, 2, 3, 1};
        int n = arr.length;
        
        quickSort(arr, 0, n-1);

        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
