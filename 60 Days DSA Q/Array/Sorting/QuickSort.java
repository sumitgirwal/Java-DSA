

public class QuickSort {

    public static int getPivot(int arr[], int s, int e){
        // adding array first element as pivot
        int pivot = arr[s];

        // find count of less values
        int count = 0;
        int i = s;
        while(i<e){
            if(arr[i]>arr[pivot]){
                break;
            }
            count+=1;
        }

        // swaping the element with pivot
        int temp = arr[pivot];
        arr[pivot] = arr[count+s];
        arr[count+s] = temp;

        pivot = count+s;

        i=s;
        int j=e;
        
        while(i<j){

            while(arr[i]<arr[pivot]){
                i+=1;
            }

            while(arr[j]>arr[pivot]){
                j-=1;
            }

            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        return pivot;
    }
    
    public static void quickSort(int arr[], int s, int e){
        
        // if end reach return
        if(s>=e)
            return;

        // getting the pivot value
        int pivot = getPivot(arr, s, e);

        System.out.println(pivot);
        
        // sorting value on left side
        quickSort(arr, s, pivot-1);

        // sorting on right side
        quickSort(arr, pivot+1, e);

        
    }

    
    public static void main(String args[]){

        int arr[] = {3, 2, 5, 7, 4};
        int n = arr.length;
        System.out.println("ITs working..");
        quickSort(arr, 0, n-1);
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
         

    }
    
}
