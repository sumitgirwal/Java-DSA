public class FindInt {

    public static int getMissing(int arr[], int n){
        int sum = (n+1)*(n+2)/2;

        for(int i=0; i<n; i++){
            sum -= arr[i];
        }

        return sum;
    }

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;

        int missing = getMissing(arr, n);
        
        System.out.println(missing);

        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

         

    }
}